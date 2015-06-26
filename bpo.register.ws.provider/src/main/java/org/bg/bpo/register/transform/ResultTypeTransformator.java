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

import bg.egov.regix.patentdepartment.TradeMarkType;
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
		
		type.setMarkCurrentStatusCode(null);
		
		try {
			type.setApplicationDate(convertToCalendar(mark.getDtappli()));
			type.setExpiryDate(convertToCalendar(mark.getDtexpi()));
			type.setRegistrationDate(convertToCalendar(mark.getDtgrant()));
		} catch (DatatypeConfigurationException exc) {
		}
		
		type.setMarkCurrentStatusDate(null);
		type.setMarkImageDetails(null);
		type.setGoodsServicesDetails(null);
		type.setPriorityDetails(null);
		type.setExhibitionPriorityDetails(null);
		type.setPublicationDetails(null);
		type.setApplicantDetails(null);
		type.setRepresentativeDetails(null);
		type.setExhibitionPriorityDetails(null);
		type.setMarkDescriptionDetails(null);
		type.setMarkDisclaimerDetails(null);
		type.setPublicationDetails(null);
		
		return null;
	}

	private WordMarkSpecificationType setWordMarkSpecification(Mark mark) {
		// TODO Auto-generated method stub
		return null;
	}

	private String setKindMark(Integer kdmark) {
		// TODO Auto-generated method stub
		return null;
	}

	private String setMarkFeature(Integer ntmark) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private XMLGregorianCalendar convertToCalendar(Date date) throws DatatypeConfigurationException {
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(date);
		XMLGregorianCalendar calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		return calendar;
	}

}
