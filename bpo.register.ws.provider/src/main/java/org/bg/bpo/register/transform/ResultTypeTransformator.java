package org.bg.bpo.register.transform;

import java.util.ArrayList;
import java.util.List;

import org.bg.bpo.register.dbconnection.DatabaseConnector;
import org.bg.bpo.register.entities.schema_tmview.Mark;

import bg.egov.regix.patentdepartment.TradeMarkType;

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
		
		type.setApplicantSideCaseKey(null);
		type.setApplicationDate(null);
		type.setApplicationLanguageCode(null);
		type.setApplicationNumber(null);
		type.setApplicationReference(null);
		type.setExpiryDate(null);
		type.setKindMark(null);
		type.setMarkCurrentStatusCode(null);
		type.setMarkFeature(null);
		type.setRegistrationDate(null);
		type.setRegistrationNumber(null);
		type.setRegistrationOfficeCode(null);
		type.setWordMarkSpecification(null);
		
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

}
