package org.bg.bpo.register.transform;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.bg.bpo.register.dbconnection.DatabaseConnector;
import org.bg.bpo.register.entities.schema_tmview.Mark;

import bg.egov.regix.patentdepartment.MarkCurrentStatusCodeType;
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

public class ResultTypeTransformator {
	DatabaseConnector connector;
	List<Mark> marks;
	
	public ResultTypeTransformator(List<Mark> marks, DatabaseConnector conn) {
		connector = conn;
		this.marks = marks;
	}
	
	public List<TradeMarkType> transformToResultType() {
		List<TradeMarkType> list = new ArrayList<TradeMarkType>();
		for (int i = 0 ; i < marks.size() ; i++) {
			list.add(transformMark(marks.get(i)));
		}
		return list;
	}

	private TradeMarkType transformMark(Mark mark) {
		TradeMarkType type = new TradeMarkType();
		
		type.setApplicantSideCaseKey(mark.getKdmark().toString());
		type.setApplicationLanguageCode("BG");
		type.setApplicationNumber(mark.getIdappli());
		type.setApplicationReference(mark.getLgstmark().toString());
		type.setKindMark(setKindMark(mark.getKdmark()));
		type.setMarkFeature(setMarkFeature(mark.getNtmark()));
		type.setRegistrationNumber(mark.getIdmark());
		type.setRegistrationOfficeCode("BG");
		type.setWordMarkSpecification(setWordMarkSpecification(mark));
		
		type.setMarkCurrentStatusCode(getMarkCurrentStatusCode(mark));
		
		try {
			type.setApplicationDate(convertToCalendar(mark.getDtappli()));
			type.setExpiryDate(convertToCalendar(mark.getDtexpi()));
			type.setRegistrationDate(convertToCalendar(mark.getDtgrant()));
			type.setMarkCurrentStatusDate(convertToCalendar(mark.getDtlgstmark()));
		} catch (DatatypeConfigurationException exc) {
		}
		
		type.setMarkImageDetails(getMarkImageDetails(mark));
		type.setGoodsServicesDetails(getGoodsServicesDetailse(mark));
		type.setPriorityDetails(getPriorityDetails(mark));
		type.setExhibitionPriorityDetails(getExhibitionPrioDetails(mark));
		type.setPublicationDetails(getPublicationDetials(mark));
		type.setApplicantDetails(getApplicantDetails(mark));
		type.setRepresentativeDetails(getRepresentativeDetails(mark));
		type.setMarkDescriptionDetails(getMarkDescriptionDetails(mark));
		type.setMarkDisclaimerDetails(getMarkDisclaimerDetails(mark));
		type.setPublicationDetails(getPublicationDetails(mark));
		
		return null;
	}

	private MarkCurrentStatusCodeType getMarkCurrentStatusCode(Mark mark) {
		String detailedCode = connector.getMarkCurrentStatusCodeForMark(mark.getLgstmark());
		return MarkCurrentStatusCodeType.fromValue(detailedCode);
	}

	private PublicationDetails getPublicationDetails(Mark mark) {
		// TODO Auto-generated method stub
		return null;
	}

	private MarkDisclaimerDetails getMarkDisclaimerDetails(Mark mark) {
		// TODO Auto-generated method stub
		return null;
	}

	private MarkDescriptionDetails getMarkDescriptionDetails(Mark mark) {
		// TODO Auto-generated method stub
		return null;
	}

	private RepresentativeDetails getRepresentativeDetails(Mark mark) {
		// TODO Auto-generated method stub
		return null;
	}

	private ApplicantDetails getApplicantDetails(Mark mark) {
		// TODO Auto-generated method stub
		return null;
	}

	private PublicationDetails getPublicationDetials(Mark mark) {
		// TODO Auto-generated method stub
		return null;
	}

	private ExhibitionPriorityDetails getExhibitionPrioDetails(Mark mark) {
		// TODO Auto-generated method stub
		return null;
	}

	private PriorityDetails getPriorityDetails(Mark mark) {
		// TODO Auto-generated method stub
		return null;
	}

	private GoodsServicesDetails getGoodsServicesDetailse(Mark mark) {
		// TODO Auto-generated method stub
		return null;
	}

	private MarkImageDetails getMarkImageDetails(Mark mark) {
		// TODO Auto-generated method stub
		return null;
	}

	private WordMarkSpecificationType setWordMarkSpecification(Mark mark) {
		// TODO Auto-generated method stub
		return null;
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
		return "Not set";
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
