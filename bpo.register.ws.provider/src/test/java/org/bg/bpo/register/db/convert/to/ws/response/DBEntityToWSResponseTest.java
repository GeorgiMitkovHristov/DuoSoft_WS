package org.bg.bpo.register.db.convert.to.ws.response;

import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import org.bg.bpo.register.db.connectivity.DatabaseConnector;
import org.bg.bpo.register.db.entities.schema.tmview.Mark;
import org.junit.Before;
import org.junit.Test;

import bg.egov.regix.patentdepartment.TradeMarkType;

public class DBEntityToWSResponseTest {
	private DatabaseConnector dbConn;
	
	@Before
	public void setUp() {
		dbConn = DatabaseConnector.getInstance();
	}
	
	@Test
	public void convertMarkWithImageDetails() throws DatatypeConfigurationException, IOException {
		Mark mark = dbConn.getMarkByAppNum("1952120007N");

		List<Mark> marks = new ArrayList<Mark>();
		marks.add(mark);
		DBEntityToWSResponse converter = new DBEntityToWSResponse(marks, dbConn);
		List<TradeMarkType> wsResponse = converter.convertToWSResponseType();
		
		assertEquals("Unexpected size of WS Response !", 1, wsResponse.size());
		
		for(TradeMarkType entry : wsResponse) {
			assertEquals("Unexpected registrationOfficeCode value !", "BG", entry.getRegistrationOfficeCode());
			assertEquals("Unexpected applicationNumber value !", "1952120007N", entry.getApplicationNumber());
			assertEquals("Unexpected applicationDate value !", "1952-07-30T00:00:00.000+02:00", entry.getApplicationDate().toString());
			assertEquals("Unexpected registrationNumber value !", "00001536", entry.getRegistrationNumber());
			assertEquals("Unexpected registrationDate value !", "1954-08-30T00:00:00.000+02:00", entry.getRegistrationDate().toString());
			assertEquals("Unexpected ApplicationReference value !", "34", entry.getApplicationReference());
			assertEquals("Unexpected ApplicantSideCaseKey value !", "205", entry.getApplicantSideCaseKey());
			assertEquals("Unexpected applicationLanguageCode value !", "BG", entry.getApplicationLanguageCode());
			assertEquals("Unexpected expiryDate value !", "2017-07-05T00:00:00.000+03:00", entry.getExpiryDate().toString());
			assertEquals("Unexpected markCurrentStatusCode value !", "Registered", entry.getMarkCurrentStatusCode().value());
			assertEquals("Unexpected currentStatusDate value !", "2007-07-13T00:00:00.000+03:00", entry.getMarkCurrentStatusDate().toString());
			assertEquals("Unexpected kindMark value !", "Individual", entry.getKindMark());
			assertEquals("Unexpected markFeature value !", "Figurative", entry.getMarkFeature());
			assertEquals("Unexpected MarkDescription value !", "", entry.getMarkDescriptionDetails().getMarkDescription().get(0));
			assertEquals("Unexpected MarkDisclaimer value !", "", entry.getMarkDisclaimerDetails().getMarkDisclaimer().get(0));
			assertEquals("Unexpected MarkDisclaimer value !", "", entry.getMarkDisclaimerDetails().getMarkDisclaimer().get(0));
			assertEquals("Unexpected MarkVerbalElementText value !", "", entry.getWordMarkSpecification().getMarkVerbalElementText().getValue());
			assertEquals("Unexpected MarkTranslation value !", "", entry.getWordMarkSpecification().getMarkTranslation().get(0).getValue());
			// ??? no translit definition in WordMarkSpecificationType
			//assertEquals("Unexpected MarkTransliteration value !", "", entry.getWordMarkSpecification().getMarkTransliteration().get(0).getValue());
			assertNotNull("No MarkImageDetails->binary value !", entry.getMarkImageDetails().getMarkImage().getMarkImageBinary());
			assertEquals("Unexpected MarkImageDetails->colorclaim value !", "", entry.getMarkImageDetails().getMarkImage().getMarkImageColourClaimedText().get(0).getValue());
			assertEquals("Unexpected MarkImageDetails->fileformat value !", ".JPG", entry.getMarkImageDetails().getMarkImage().getMarkImageFileFormat());
			assertEquals("Unexpected MarkImageDetails->categoryCode value !", "03.09.01", entry.getMarkImageDetails().getMarkImage().getMarkImageCategory().getCategoryCodeDetails().getCategoryCode().get(0));

			assertEquals("Unexpected GoodsServicesDetails->classNumber value !", "6", entry.getGoodsServicesDetails().getGoodsServices().getClassDescriptionDetails().getClassDescription().get(0).getClassNumber());
			assertEquals("Unexpected GoodsServicesDetails->languagecode value !", null, entry.getGoodsServicesDetails().getGoodsServices().getClassDescriptionDetails().getClassDescription().get(0).getGoodsServicesDescription().get(0).getLanguageCode());
			assertEquals("Unexpected GoodsServicesDetails->sequencenumber value !", null, entry.getGoodsServicesDetails().getGoodsServices().getClassDescriptionDetails().getClassDescription().get(0).getGoodsServicesDescription().get(0).getSequenceNumber());
			assertEquals("Unexpected GoodsServicesDetails->value value !", "желязо и стомана във формата на блокове, прътове, кюлчета, чембери, листове, плаки, тръби, греди", entry.getGoodsServicesDetails().getGoodsServices().getClassDescriptionDetails().getClassDescription().get(0).getGoodsServicesDescription().get(0).getValue());

			assertEquals("PriorityDetails not expected !", 0, entry.getPriorityDetails().getPriority().size());
			assertEquals("ExhibitionPriorityDetails not expected !", 0, entry.getExhibitionPriorityDetails().getExhibitionPriority().size());

			assertEquals("PublicationDetails expected !", 1, entry.getPublicationDetails().getPublication().size());
			assertEquals("Unexpected PublicationDetails->identifier value !", "12", entry.getPublicationDetails().getPublication().get(0).getPublicationIdentifier());
			assertEquals("Unexpected PublicationDetails->section value !", "9", entry.getPublicationDetails().getPublication().get(0).getPublicationSection());
			assertEquals("Unexpected PublicationDetails->subsection value !", "1997", entry.getPublicationDetails().getPublication().get(0).getPublicationSubsection());
			assertEquals("Unexpected PublicationDetails->date value !", "1998-01-31T00:00:00.000+02:00", entry.getPublicationDetails().getPublication().get(0).getPublicationDate().toString());

			assertEquals("Unexpected ApplicantDetails->NationalityCode value !", "SE", entry.getApplicantDetails().getApplicant().getApplicantNationalityCode());
			assertEquals("Unexpected ApplicantDetails->Identifier value !", "128430", entry.getApplicantDetails().getApplicant().getApplicantIdentifier().get(0));
			
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedName->FirstName value !", null, entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getName().getFormattedName().getFirstName());
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedName->MiddleName value !", null, entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getName().getFormattedName().getMiddleName());
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedName->LastName value !", "Kapman AB", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getName().getFormattedName().getLastName());
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedName->NamePrefix value !", null, entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getName().getFormattedName().getNamePrefix());
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedName->OrganizationName value !", "2", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getName().getFormattedName().getOrganizationName());
			
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedAddress->AddressStreet value !", ".", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressStreet());
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedAddress->AddressCity value !", "Sandviken                                                                       ", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressCity());
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedAddress->AddressCountry value !", "SWEDEN", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressCounty());
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedAddress->AddressState value !", ".", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressState());
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedAddress->AddressPostCode value !", "S-811 81  ", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressPostcode());
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedAddress->FormattedAddressCountryCode value !", "SE", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getFormattedAddressCountryCode());
			
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->ContactInformationDetails->Phone value !", "", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getContactInformationDetails().getPhone().get(0));
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->ContactInformationDetails->Fax value !", "", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getContactInformationDetails().getFax().get(0));
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->ContactInformationDetails->Email value !", "", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getContactInformationDetails().getEmail().get(0));

			assertEquals("Unexpected RepresentativeDetails->RepresentativeIdentifier value !", new BigInteger("7"), entry.getRepresentativeDetails().getRepresentative().getRepresentativeIdentifier());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeNationalityCode value !", "BG", entry.getRepresentativeDetails().getRepresentative().getRepresentativeNationalityCode());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeLegalEntity value !", "2", entry.getRepresentativeDetails().getRepresentative().getRepresentativeLegalEntity());
			
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedName->FirstName value !", "Красимира", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getName().getFormattedName().getFirstName());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedName->MiddleName value !", "Дамянова", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getName().getFormattedName().getMiddleName());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedName->LastName value !", "Цоцова", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getName().getFormattedName().getLastName());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedName->NamePrefix value !", null, entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getName().getFormattedName().getNamePrefix());

			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedAddress->AddressStreet value !", "ул.\"Ген. Щерю Атанасов\" 5", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressStreet());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedAddress->AddressCity value !", "София                                                                           ", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressCity());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedAddress->AddressCountry value !", "БЪЛГАРИЯ", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressCounty());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedAddress->AddressState value !", "", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressState());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedAddress->AddressPostCode value !", "1113      ", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressPostcode());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedAddress->FormattedAddressCountryCode value !", "BG", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getFormattedAddressCountryCode());

			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->ContactInformationDetails->Phone value !", "9655110, 9655101 9655111, 9655121", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getContactInformationDetails().getPhone().get(0));
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->ContactInformationDetails->Fax value !", "", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getContactInformationDetails().getFax().get(0));
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->ContactInformationDetails->Email value !", "", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getContactInformationDetails().getEmail().get(0));
		}
	}
	
	@Test
	public void convertMarkWithPriorityDetails() throws DatatypeConfigurationException, IOException {
		Mark mark = dbConn.getMarkByAppNum("1969006862N");
		List<Mark> marks = new ArrayList<Mark>();
		marks.add(mark);
		DBEntityToWSResponse converter = new DBEntityToWSResponse(marks, dbConn);
		List<TradeMarkType> wsResponse = converter.convertToWSResponseType();
		
		assertEquals("Unexpected size of WS Response !", 1, wsResponse.size());
		
		for(TradeMarkType entry : wsResponse) {
			assertEquals("Unexpected registrationOfficeCode value !", "BG", entry.getRegistrationOfficeCode());
			assertEquals("Unexpected applicationNumber value !", "1969006862N", entry.getApplicationNumber());
			assertEquals("Unexpected applicationDate value !", "1969-05-23T00:00:00.000+02:00", entry.getApplicationDate().toString());
			assertEquals("Unexpected registrationNumber value !", "00006862", entry.getRegistrationNumber());
			assertEquals("Unexpected registrationDate value !", "1969-08-21T00:00:00.000+02:00", entry.getRegistrationDate().toString());
			assertEquals("Unexpected ApplicationReference value !", "835", entry.getApplicationReference());
			assertEquals("Unexpected ApplicantSideCaseKey value !", "2409", entry.getApplicantSideCaseKey());
			assertEquals("Unexpected applicationLanguageCode value !", "BG", entry.getApplicationLanguageCode());
			assertEquals("Unexpected expiryDate value !", "1999-05-23T00:00:00.000+03:00", entry.getExpiryDate().toString());
			assertEquals("Unexpected markCurrentStatusCode value !", "Expired", entry.getMarkCurrentStatusCode().value());
			assertEquals("Unexpected currentStatusDate value !", "2001-03-22T00:00:00.000+02:00", entry.getMarkCurrentStatusDate().toString());
			assertEquals("Unexpected kindMark value !", "Individual", entry.getKindMark());
			assertEquals("Unexpected markFeature value !", "Word", entry.getMarkFeature());
			assertEquals("Unexpected MarkDescription value !", "", entry.getMarkDescriptionDetails().getMarkDescription().get(0));
			assertEquals("Unexpected MarkDisclaimer value !", "", entry.getMarkDisclaimerDetails().getMarkDisclaimer().get(0));
			assertEquals("Unexpected MarkDisclaimer value !", "", entry.getMarkDisclaimerDetails().getMarkDisclaimer().get(0));
			assertEquals("Unexpected MarkVerbalElementText value !", "EDISTIR", entry.getWordMarkSpecification().getMarkVerbalElementText().getValue());
			assertEquals("Unexpected MarkTranslation value !", "", entry.getWordMarkSpecification().getMarkTranslation().get(0).getValue());
			// ??? no translit definition in WordMarkSpecificationType
			//assertEquals("Unexpected MarkTransliteration value !", "", entry.getWordMarkSpecification().getMarkTransliteration().get(0).getValue());
			assertNull("No MarkImageDetails expected !", entry.getMarkImageDetails().getMarkImage().getMarkImageBinary());

			assertEquals("Unexpected GoodsServicesDetails->classNumber value !", "1", entry.getGoodsServicesDetails().getGoodsServices().getClassDescriptionDetails().getClassDescription().get(0).getClassNumber());
			assertEquals("Unexpected GoodsServicesDetails->languagecode value !", null, entry.getGoodsServicesDetails().getGoodsServices().getClassDescriptionDetails().getClassDescription().get(0).getGoodsServicesDescription().get(0).getLanguageCode());
			assertEquals("Unexpected GoodsServicesDetails->sequencenumber value !", null, entry.getGoodsServicesDetails().getGoodsServices().getClassDescriptionDetails().getClassDescription().get(0).getGoodsServicesDescription().get(0).getSequenceNumber());
			assertEquals("Unexpected GoodsServicesDetails->value value !", "химически продукти за употреба в производството, синтетични смолисти материали във форма на течности, прахове и гранулати за формуване, изливане и инжектиране, пластични материали и синтетични смолисти смеси", entry.getGoodsServicesDetails().getGoodsServices().getClassDescriptionDetails().getClassDescription().get(0).getGoodsServicesDescription().get(0).getValue());
			
			assertEquals("PriorityDetails expected !", 1, entry.getPriorityDetails().getPriority().size());
			assertEquals("Unexpected PriorityDetails->priorityNumber value !", ".              ", entry.getPriorityDetails().getPriority().get(0).getPriorityNumber());
			assertEquals("Unexpected PriorityDetails->priorityCountryCode value !", "IT", entry.getPriorityDetails().getPriority().get(0).getPriorityCountryCode());
			assertEquals("Unexpected PriorityDetails->priorityDate value !", "1969-01-15T00:00:00.000+02:00", entry.getPriorityDetails().getPriority().get(0).getPriorityDate().toString());
			
			assertEquals("ExhibitionPriorityDetails not expected !", 0, entry.getExhibitionPriorityDetails().getExhibitionPriority().size());
			
			assertEquals("PublicationDetails not expected !", 0, entry.getPublicationDetails().getPublication().size());

			assertEquals("Unexpected ApplicantDetails->NationalityCode value !", "IT", entry.getApplicantDetails().getApplicant().getApplicantNationalityCode());
			assertEquals("Unexpected ApplicantDetails->Identifier value !", "107604", entry.getApplicantDetails().getApplicant().getApplicantIdentifier().get(0));
			
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedName->FirstName value !", null, entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getName().getFormattedName().getFirstName());
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedName->MiddleName value !", null, entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getName().getFormattedName().getMiddleName());
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedName->LastName value !", "ENICHEM S.p.A.", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getName().getFormattedName().getLastName());
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedName->NamePrefix value !", null, entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getName().getFormattedName().getNamePrefix());
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedName->OrganizationName value !", "2", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getName().getFormattedName().getOrganizationName());

			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedAddress->AddressStreet value !", "Piazza Boldrini 1", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressStreet());
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedAddress->AddressCity value !", "SAN DONATO MILANESE                                                             ", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressCity());
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedAddress->AddressCountry value !", "ITALY", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressCounty());
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedAddress->AddressState value !", "", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressState());
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedAddress->AddressPostCode value !", ".         ", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressPostcode());
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->FormattedAddress->FormattedAddressCountryCode value !", "IT", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getFormattedAddressCountryCode());
			
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->ContactInformationDetails->Phone value !", "", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getContactInformationDetails().getPhone().get(0));
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->ContactInformationDetails->Fax value !", "", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getContactInformationDetails().getFax().get(0));
			assertEquals("Unexpected ApplicantDetails->ApplicantAddressBook->ContactInformationDetails->Email value !", "", entry.getApplicantDetails().getApplicant().getApplicantAddressBook().getContactInformationDetails().getEmail().get(0));
			
			assertEquals("Unexpected RepresentativeDetails->RepresentativeIdentifier value !", new BigInteger("39"), entry.getRepresentativeDetails().getRepresentative().getRepresentativeIdentifier());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeNationalityCode value !", "BG", entry.getRepresentativeDetails().getRepresentative().getRepresentativeNationalityCode());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeLegalEntity value !", "3", entry.getRepresentativeDetails().getRepresentative().getRepresentativeLegalEntity());
			
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedName->FirstName value !", "Веселина", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getName().getFormattedName().getFirstName());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedName->MiddleName value !", "Пенчева", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getName().getFormattedName().getMiddleName());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedName->LastName value !", "Пенева", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getName().getFormattedName().getLastName());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedName->NamePrefix value !", null, entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getName().getFormattedName().getNamePrefix());

			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedAddress->AddressStreet value !", "ул. \"Леонардо да Винчи\" 3", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressStreet());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedAddress->AddressCity value !", "София                                                                           ", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressCity());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedAddress->AddressCountry value !", "БЪЛГАРИЯ", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressCounty());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedAddress->AddressState value !", "", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressState());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedAddress->AddressPostCode value !", "1124      ", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getAddressPostcode());
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->FormattedAddress->FormattedAddressCountryCode value !", "BG", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getFormattedNameAddress().getAddress().getFormattedAddress().getFormattedAddressCountryCode());

			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->ContactInformationDetails->Phone value !", "843-53-86 943-44-23, 983-51-80", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getContactInformationDetails().getPhone().get(0));
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->ContactInformationDetails->Fax value !", "", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getContactInformationDetails().getFax().get(0));
			assertEquals("Unexpected RepresentativeDetails->RepresentativeAddressBook->ContactInformationDetails->Email value !", "irinpat@cablebg.net                                                                                                                                                                                     ", entry.getRepresentativeDetails().getRepresentative().getRepresentativeAddressBook().getContactInformationDetails().getEmail().get(0));
		}
	}
}
