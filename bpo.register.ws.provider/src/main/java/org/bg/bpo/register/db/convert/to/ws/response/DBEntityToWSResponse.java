package org.bg.bpo.register.db.convert.to.ws.response;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.bg.bpo.register.db.connectivity.DatabaseConnector;
import org.bg.bpo.register.db.entities.schema.tmview.Categpict;
import org.bg.bpo.register.db.entities.schema.tmview.Classmark;
import org.bg.bpo.register.db.entities.schema.tmview.Mark;
import org.bg.bpo.register.db.entities.schema.tmview.Picture;
import org.bg.bpo.register.db.entities.schema.tmview.Priority;
import org.bg.bpo.register.db.entities.schema.tmview.Publication;

import bg.egov.regix.patentdepartment.ClassDescriptionType;
import bg.egov.regix.patentdepartment.ExhibitionPriorityType;
import bg.egov.regix.patentdepartment.GoodsServicesType;
import bg.egov.regix.patentdepartment.MarkCurrentStatusCodeType;
import bg.egov.regix.patentdepartment.MarkImageCategoryType;
import bg.egov.regix.patentdepartment.MarkImageCategoryType.CategoryCodeDetails;
import bg.egov.regix.patentdepartment.MarkImageType;
import bg.egov.regix.patentdepartment.PriorityType;
import bg.egov.regix.patentdepartment.PublicationType;
import bg.egov.regix.patentdepartment.TextType;
import bg.egov.regix.patentdepartment.TradeMarkType;
import bg.egov.regix.patentdepartment.TradeMarkType.ApplicantDetails;
import bg.egov.regix.patentdepartment.TradeMarkType.ExhibitionPriorityDetails;
import bg.egov.regix.patentdepartment.TradeMarkType.GoodsServicesDetails;
import bg.egov.regix.patentdepartment.TradeMarkType.MarkDescriptionDetails;
import bg.egov.regix.patentdepartment.TradeMarkType.MarkDisclaimerDetails;
import bg.egov.regix.patentdepartment.TradeMarkType.MarkImageDetails;
import bg.egov.regix.patentdepartment.TradeMarkType.PriorityDetails;
import bg.egov.regix.patentdepartment.TradeMarkType.PublicationDetails;
import bg.egov.regix.patentdepartment.TradeMarkType.RepresentativeDetails;
import bg.egov.regix.patentdepartment.WordMarkSpecificationType;

public class DBEntityToWSResponse {
	DatabaseConnector connector;
	List<Mark> marks;
	
	public DBEntityToWSResponse(List<Mark> marks, DatabaseConnector conn) {
		connector = conn;
		this.marks = marks;
	}
	
	public List<TradeMarkType> convertToWSResponseType() throws DatatypeConfigurationException {
		List<TradeMarkType> list = new ArrayList<TradeMarkType>();
		for (int i = 0 ; i < marks.size() ; i++) {
			list.add(convertEntity(marks.get(i)));
		}
		return list;
	}

	private TradeMarkType convertEntity(Mark mark) throws DatatypeConfigurationException {
		TradeMarkType type = new TradeMarkType();
		
		type.setRegistrationOfficeCode("BG");
		type.setApplicationNumber(mark.getIdappli());
		type.setApplicationDate(convertToCalendar(mark.getDtappli()));
		type.setRegistrationNumber(mark.getIdmark());
		type.setRegistrationDate(convertToCalendar(mark.getDtgrant()));
		type.setApplicationReference(mark.getLgstmark().toString());
		type.setApplicantSideCaseKey(mark.getKMark().toString());
		type.setApplicationLanguageCode("BG");
		type.setExpiryDate(convertToCalendar(mark.getDtexpi()));
		type.setMarkCurrentStatusCode(getMarkCurrentStatusCode(mark));
		type.setMarkCurrentStatusDate(convertToCalendar(mark.getDtlgstmark()));
		type.setKindMark(setKindMark(mark.getKdmark()));
		type.setMarkFeature(setMarkFeature(mark.getNtmark()));
		type.setMarkDescriptionDetails(getMarkDescriptionDetails(mark));
		type.setMarkDisclaimerDetails(getMarkDisclaimerDetails(mark));
		type.setWordMarkSpecification(setWordMarkSpecification(mark));
		type.setMarkImageDetails(getMarkImageDetails(mark));
		type.setGoodsServicesDetails(getGoodsServicesDetails(mark));
		TradeMarkType.ExhibitionPriorityDetails eDetails = new TradeMarkType.ExhibitionPriorityDetails();
		TradeMarkType.PriorityDetails details = new TradeMarkType.PriorityDetails();
		setPriorityDetails(mark, details, eDetails);
		type.setPriorityDetails(details);
		type.setExhibitionPriorityDetails(eDetails);
		type.setPublicationDetails(getPublicationDetails(mark));
		type.setApplicantDetails(getApplicantDetails(mark));
		type.setRepresentativeDetails(getRepresentativeDetails(mark));
		
		return type;
	}

	private MarkCurrentStatusCodeType getMarkCurrentStatusCode(Mark mark) {
		String detailedCode = connector.getMarkCurrentStatusCodeForMark(mark.getLgstmark());
		return MarkCurrentStatusCodeType.fromValue(detailedCode);
	}

	private PublicationDetails getPublicationDetails(Mark mark) throws DatatypeConfigurationException {
		TradeMarkType.PublicationDetails details = new TradeMarkType.PublicationDetails();
		List<PublicationType> publications = new ArrayList<PublicationType>();
		List<Publication> markPublications = mark.getPublications();
		
		for(Publication publication : markPublications) {
			PublicationType type = new PublicationType();
			type.setPublicationIdentifier(publication.getNogazette().toString());
			type.setPublicationSection(publication.getNosect());
			type.setPublicationSubsection(publication.getYygazette().toString());
			type.setPublicationDate(convertToCalendar(publication.getDttopubli()));
			publications.add(type);
		}
		
		if(publications.size()>0) {
			details.getPublication().addAll(publications);
		}
		
		return details;
	}

	private MarkDisclaimerDetails getMarkDisclaimerDetails(Mark mark) {
		TradeMarkType.MarkDisclaimerDetails details = new TradeMarkType.MarkDisclaimerDetails();
		details.getMarkDisclaimer().add(mark.getDisclaimer());
		return details;
	}

	private MarkDescriptionDetails getMarkDescriptionDetails(Mark mark) {
		TradeMarkType.MarkDescriptionDetails details = new TradeMarkType.MarkDescriptionDetails();
		details.getMarkDescription().add(mark.getDescmark());
		return details;
	}

	private RepresentativeDetails getRepresentativeDetails(Mark mark) {
		// TODO Auto-generated method stub
		return null;
	}

	private ApplicantDetails getApplicantDetails(Mark mark) {
		// TODO Auto-generated method stub
		return null;
	}

	private void setPriorityDetails(Mark mark, PriorityDetails pd, ExhibitionPriorityDetails epd) throws DatatypeConfigurationException {
		List<PriorityType> priorities = new ArrayList<PriorityType>();
		List<ExhibitionPriorityType> ePriorities = new ArrayList<ExhibitionPriorityType>();
		List<Priority> markPriorities = mark.getPriorities();
		
		for(Priority priority : markPriorities) {
			if (priority.getTyprio() == 1) {
				PriorityType type = new PriorityType();
				type.setPriorityCountryCode(priority.getIdcountry());
				type.setPriorityNumber(priority.getNoprio());
				type.setPriorityDate(convertToCalendar(priority.getDtprio()));
				priorities.add(type);
			}
			if (priority.getTyprio() == 2) {
				ExhibitionPriorityType type = new ExhibitionPriorityType();
				type.setExhibitionCountryCode(priority.getIdcountry());
				type.setExhibitionName(priority.getRmprio());
				type.setExhibitionDate(convertToCalendar(priority.getDtprio()));
				ePriorities.add(type);
			}
		}
		pd.getPriority().addAll(priorities);
		epd.getExhibitionPriority().addAll(ePriorities);
	}

	private GoodsServicesDetails getGoodsServicesDetails(Mark mark) {
		TradeMarkType.GoodsServicesDetails details = new TradeMarkType.GoodsServicesDetails();
		GoodsServicesType goodService = new GoodsServicesType();
		List<Classmark> classmarks = mark.getClassmarks();

		if(classmarks!=null) {
			for(Classmark entry : classmarks) {
				ClassDescriptionType classDescription = new ClassDescriptionType();
				classDescription.setClassNumber(entry.getIdclass().toString());
				TextType specif = new TextType();
				specif.setValue(entry.getSpecif());
				classDescription.getGoodsServicesDescription().add(specif);
				goodService.getClassDescriptionDetails().getClassDescription().add(classDescription);
			}
		}
		
		if(goodService.getClassDescriptionDetails().getClassDescription().size()>0) {
			details.setGoodsServices(goodService);
		}
		
		return details;
	}

	private MarkImageDetails getMarkImageDetails(Mark mark) {
		TradeMarkType.MarkImageDetails details = new TradeMarkType.MarkImageDetails();
		MarkImageCategoryType imageCategory = new MarkImageCategoryType();
		CategoryCodeDetails codeDetails = new CategoryCodeDetails();

		MarkImageType markImage = new MarkImageType();
		final Picture markPicture = mark.getPicture();
		
		if(markPicture != null) {
			markImage.setMarkImageFileFormat(markPicture.getFormatfile());
		}
		
		TextType color = new TextType();
		color.setValue(mark.getColorclaim());
		markImage.getMarkImageColourClaimedText().add(color);
		
		List<Categpict> imageCategoryValues = connector.getImageCategory(mark.getIdappli());
		
		if(imageCategoryValues != null) {
			for(Categpict entry : imageCategoryValues) {
				codeDetails.getCategoryCode().add(entry.getId().getIdcategory());
			}
		}
		imageCategory.setCategoryCodeDetails(codeDetails);
		markImage.setMarkImageCategory(imageCategory);
		
		if(markPicture != null) {
			markImage.setMarkImageBinary(markPicture.getPicture());
		}

		details.setMarkImage(markImage);
		
		return details;
	}

	private WordMarkSpecificationType setWordMarkSpecification(Mark mark) {
		WordMarkSpecificationType type = new WordMarkSpecificationType();
		TextType textType = new TextType();
		TextType textTypeTrans = new TextType();
		TextType textTypeTranslit = new TextType();
		
		textType.setValue(mark.getDeno());
		textTypeTrans.setValue(mark.getTranslat());
		textTypeTranslit.setValue(mark.getTranslit());
		
		type.setMarkVerbalElementText(textType);
		type.getMarkTranslation().add(textTypeTrans);
		return type;
	}

	private String setKindMark(Integer kdmark) {
		switch (kdmark) {
			case 1:
				return "Individual";
			case 2:
				return "Collective";
			case 3:
				return "Certificate";
			case 4:
				return "Individual";
		}
		
		return null;
	}

	private String setMarkFeature(Integer ntmark) {
		switch (ntmark) {
			case 1:
				return "Word";
			case 2:
				return "Figurative";
			case 3:
				return "Combined";
			case 4:
				return "3-D";
			case 5:
				return "Sound";
		}
		
		return "Other";
	}
	
	private XMLGregorianCalendar convertToCalendar(Date date) throws DatatypeConfigurationException {
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(date);
		XMLGregorianCalendar calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		return calendar;
	}

}
