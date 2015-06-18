
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.bg.bpo.register.search;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.16
 * 2015-06-18T18:41:10.015+03:00
 * Generated source version: 2.7.16
 * 
 */

@javax.jws.WebService(
                      serviceName = "BPOSearchService",
                      portName = "BPOSearchServiceDefaultPort",
                      targetNamespace = "http://bg.org/bpo/register/search/",
                      wsdlLocation = "file:/home/danail/git/DuoSoft_WS/bpo.register.ws.provider/src/main/resources/bpo-register-search.wsdl",
                      endpointInterface = "org.bg.bpo.register.search.BPORegisterSearch")
                      
public class BPORegisterSearchImpl implements BPORegisterSearch {

    private static final Logger LOG = Logger.getLogger(BPORegisterSearchImpl.class.getName());

    /* (non-Javadoc)
     * @see org.bg.bpo.register.search.BPORegisterSearch#getMarkByRegNum(int  regnum ,)bg.egov.regix.patentdepartment.TransactionHeaderType  transactionHeader ,)java.util.List<bg.egov.regix.patentdepartment.TransactionBodyType>  tradeMarkTransactionBody )*
     */
    public void getMarkByRegNum(int regnum,javax.xml.ws.Holder<bg.egov.regix.patentdepartment.TransactionHeaderType> transactionHeader,javax.xml.ws.Holder<java.util.List<bg.egov.regix.patentdepartment.TransactionBodyType>> tradeMarkTransactionBody) { 
        LOG.info("Executing operation getMarkByRegNum");
        System.out.println(regnum);
        try {
            bg.egov.regix.patentdepartment.TransactionHeaderType transactionHeaderValue = new bg.egov.regix.patentdepartment.TransactionHeaderType();
            bg.egov.regix.patentdepartment.TransactionHeaderType.SenderDetails transactionHeaderValueSenderDetails = new bg.egov.regix.patentdepartment.TransactionHeaderType.SenderDetails();
            transactionHeaderValueSenderDetails.setRequestProducer("RequestProducer271085440");
            transactionHeaderValueSenderDetails.setRequestProducerDateTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2015-06-18T18:41:10.054+03:00"));
            transactionHeaderValue.setSenderDetails(transactionHeaderValueSenderDetails);
            transactionHeader.value = transactionHeaderValue;
            java.util.List<bg.egov.regix.patentdepartment.TransactionBodyType> tradeMarkTransactionBodyValue = new java.util.ArrayList<bg.egov.regix.patentdepartment.TransactionBodyType>();
            bg.egov.regix.patentdepartment.TransactionBodyType tradeMarkTransactionBodyValueVal1 = new bg.egov.regix.patentdepartment.TransactionBodyType();
            bg.egov.regix.patentdepartment.TransactionBodyType.TransactionErrorDetails tradeMarkTransactionBodyValueVal1TransactionErrorDetails = new bg.egov.regix.patentdepartment.TransactionBodyType.TransactionErrorDetails();
            java.util.List<bg.egov.regix.patentdepartment.TransactionErrorType> tradeMarkTransactionBodyValueVal1TransactionErrorDetailsTransactionError = new java.util.ArrayList<bg.egov.regix.patentdepartment.TransactionErrorType>();
            tradeMarkTransactionBodyValueVal1TransactionErrorDetails.getTransactionError().addAll(tradeMarkTransactionBodyValueVal1TransactionErrorDetailsTransactionError);
            tradeMarkTransactionBodyValueVal1.setTransactionErrorDetails(tradeMarkTransactionBodyValueVal1TransactionErrorDetails);
            bg.egov.regix.patentdepartment.TransactionBodyType.TransactionContentDetails tradeMarkTransactionBodyValueVal1TransactionContentDetails = new bg.egov.regix.patentdepartment.TransactionBodyType.TransactionContentDetails();
            tradeMarkTransactionBodyValueVal1TransactionContentDetails.setTransactionIdentifier("TransactionIdentifier2106280539");
            tradeMarkTransactionBodyValueVal1TransactionContentDetails.setTransactionCode("TransactionCode-1456999623");
            bg.egov.regix.patentdepartment.TransactionDataType tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionData = new bg.egov.regix.patentdepartment.TransactionDataType();
            bg.egov.regix.patentdepartment.TransactionDataType.TradeMarkDetails tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetails = new bg.egov.regix.patentdepartment.TransactionDataType.TradeMarkDetails();
            java.util.List<bg.egov.regix.patentdepartment.TradeMarkType> tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetailsTradeMark = new java.util.ArrayList<bg.egov.regix.patentdepartment.TradeMarkType>();
            tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetails.getTradeMark().addAll(tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetailsTradeMark);
            tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionData.setTradeMarkDetails(tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetails);
            tradeMarkTransactionBodyValueVal1TransactionContentDetails.setTransactionData(tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionData);
            tradeMarkTransactionBodyValueVal1.setTransactionContentDetails(tradeMarkTransactionBodyValueVal1TransactionContentDetails);
            tradeMarkTransactionBodyValue.add(tradeMarkTransactionBodyValueVal1);
            tradeMarkTransactionBody.value = tradeMarkTransactionBodyValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.bg.bpo.register.search.BPORegisterSearch#getMarksByName(java.lang.String  markname ,)bg.egov.regix.patentdepartment.TransactionHeaderType  transactionHeader ,)java.util.List<bg.egov.regix.patentdepartment.TransactionBodyType>  tradeMarkTransactionBody )*
     */
    public void getMarksByName(java.lang.String markname,javax.xml.ws.Holder<bg.egov.regix.patentdepartment.TransactionHeaderType> transactionHeader,javax.xml.ws.Holder<java.util.List<bg.egov.regix.patentdepartment.TransactionBodyType>> tradeMarkTransactionBody) { 
        LOG.info("Executing operation getMarksByName");
        System.out.println(markname);
        try {
            bg.egov.regix.patentdepartment.TransactionHeaderType transactionHeaderValue = new bg.egov.regix.patentdepartment.TransactionHeaderType();
            bg.egov.regix.patentdepartment.TransactionHeaderType.SenderDetails transactionHeaderValueSenderDetails = new bg.egov.regix.patentdepartment.TransactionHeaderType.SenderDetails();
            transactionHeaderValueSenderDetails.setRequestProducer("RequestProducer1579803474");
            transactionHeaderValueSenderDetails.setRequestProducerDateTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2015-06-18T18:41:10.056+03:00"));
            transactionHeaderValue.setSenderDetails(transactionHeaderValueSenderDetails);
            transactionHeader.value = transactionHeaderValue;
            java.util.List<bg.egov.regix.patentdepartment.TransactionBodyType> tradeMarkTransactionBodyValue = new java.util.ArrayList<bg.egov.regix.patentdepartment.TransactionBodyType>();
            bg.egov.regix.patentdepartment.TransactionBodyType tradeMarkTransactionBodyValueVal1 = new bg.egov.regix.patentdepartment.TransactionBodyType();
            bg.egov.regix.patentdepartment.TransactionBodyType.TransactionErrorDetails tradeMarkTransactionBodyValueVal1TransactionErrorDetails = new bg.egov.regix.patentdepartment.TransactionBodyType.TransactionErrorDetails();
            java.util.List<bg.egov.regix.patentdepartment.TransactionErrorType> tradeMarkTransactionBodyValueVal1TransactionErrorDetailsTransactionError = new java.util.ArrayList<bg.egov.regix.patentdepartment.TransactionErrorType>();
            tradeMarkTransactionBodyValueVal1TransactionErrorDetails.getTransactionError().addAll(tradeMarkTransactionBodyValueVal1TransactionErrorDetailsTransactionError);
            tradeMarkTransactionBodyValueVal1.setTransactionErrorDetails(tradeMarkTransactionBodyValueVal1TransactionErrorDetails);
            bg.egov.regix.patentdepartment.TransactionBodyType.TransactionContentDetails tradeMarkTransactionBodyValueVal1TransactionContentDetails = new bg.egov.regix.patentdepartment.TransactionBodyType.TransactionContentDetails();
            tradeMarkTransactionBodyValueVal1TransactionContentDetails.setTransactionIdentifier("TransactionIdentifier-600610970");
            tradeMarkTransactionBodyValueVal1TransactionContentDetails.setTransactionCode("TransactionCode1401119720");
            bg.egov.regix.patentdepartment.TransactionDataType tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionData = new bg.egov.regix.patentdepartment.TransactionDataType();
            bg.egov.regix.patentdepartment.TransactionDataType.TradeMarkDetails tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetails = new bg.egov.regix.patentdepartment.TransactionDataType.TradeMarkDetails();
            java.util.List<bg.egov.regix.patentdepartment.TradeMarkType> tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetailsTradeMark = new java.util.ArrayList<bg.egov.regix.patentdepartment.TradeMarkType>();
            tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetails.getTradeMark().addAll(tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetailsTradeMark);
            tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionData.setTradeMarkDetails(tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetails);
            tradeMarkTransactionBodyValueVal1TransactionContentDetails.setTransactionData(tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionData);
            tradeMarkTransactionBodyValueVal1.setTransactionContentDetails(tradeMarkTransactionBodyValueVal1TransactionContentDetails);
            tradeMarkTransactionBodyValue.add(tradeMarkTransactionBodyValueVal1);
            tradeMarkTransactionBody.value = tradeMarkTransactionBodyValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.bg.bpo.register.search.BPORegisterSearch#getMarkByOwnersName(java.lang.String  fname ,)java.lang.String  sname ,)java.lang.String  lname ,)bg.egov.regix.patentdepartment.TransactionHeaderType  transactionHeader ,)java.util.List<bg.egov.regix.patentdepartment.TransactionBodyType>  tradeMarkTransactionBody )*
     */
    public void getMarkByOwnersName(java.lang.String fname,java.lang.String sname,java.lang.String lname,javax.xml.ws.Holder<bg.egov.regix.patentdepartment.TransactionHeaderType> transactionHeader,javax.xml.ws.Holder<java.util.List<bg.egov.regix.patentdepartment.TransactionBodyType>> tradeMarkTransactionBody) { 
        LOG.info("Executing operation getMarkByOwnersName");
        System.out.println(fname);
        System.out.println(sname);
        System.out.println(lname);
        try {
            bg.egov.regix.patentdepartment.TransactionHeaderType transactionHeaderValue = new bg.egov.regix.patentdepartment.TransactionHeaderType();
            bg.egov.regix.patentdepartment.TransactionHeaderType.SenderDetails transactionHeaderValueSenderDetails = new bg.egov.regix.patentdepartment.TransactionHeaderType.SenderDetails();
            transactionHeaderValueSenderDetails.setRequestProducer("RequestProducer465641541");
            transactionHeaderValueSenderDetails.setRequestProducerDateTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2015-06-18T18:41:10.059+03:00"));
            transactionHeaderValue.setSenderDetails(transactionHeaderValueSenderDetails);
            transactionHeader.value = transactionHeaderValue;
            java.util.List<bg.egov.regix.patentdepartment.TransactionBodyType> tradeMarkTransactionBodyValue = new java.util.ArrayList<bg.egov.regix.patentdepartment.TransactionBodyType>();
            bg.egov.regix.patentdepartment.TransactionBodyType tradeMarkTransactionBodyValueVal1 = new bg.egov.regix.patentdepartment.TransactionBodyType();
            bg.egov.regix.patentdepartment.TransactionBodyType.TransactionErrorDetails tradeMarkTransactionBodyValueVal1TransactionErrorDetails = new bg.egov.regix.patentdepartment.TransactionBodyType.TransactionErrorDetails();
            java.util.List<bg.egov.regix.patentdepartment.TransactionErrorType> tradeMarkTransactionBodyValueVal1TransactionErrorDetailsTransactionError = new java.util.ArrayList<bg.egov.regix.patentdepartment.TransactionErrorType>();
            tradeMarkTransactionBodyValueVal1TransactionErrorDetails.getTransactionError().addAll(tradeMarkTransactionBodyValueVal1TransactionErrorDetailsTransactionError);
            tradeMarkTransactionBodyValueVal1.setTransactionErrorDetails(tradeMarkTransactionBodyValueVal1TransactionErrorDetails);
            bg.egov.regix.patentdepartment.TransactionBodyType.TransactionContentDetails tradeMarkTransactionBodyValueVal1TransactionContentDetails = new bg.egov.regix.patentdepartment.TransactionBodyType.TransactionContentDetails();
            tradeMarkTransactionBodyValueVal1TransactionContentDetails.setTransactionIdentifier("TransactionIdentifier-1351951113");
            tradeMarkTransactionBodyValueVal1TransactionContentDetails.setTransactionCode("TransactionCode-241415541");
            bg.egov.regix.patentdepartment.TransactionDataType tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionData = new bg.egov.regix.patentdepartment.TransactionDataType();
            bg.egov.regix.patentdepartment.TransactionDataType.TradeMarkDetails tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetails = new bg.egov.regix.patentdepartment.TransactionDataType.TradeMarkDetails();
            java.util.List<bg.egov.regix.patentdepartment.TradeMarkType> tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetailsTradeMark = new java.util.ArrayList<bg.egov.regix.patentdepartment.TradeMarkType>();
            tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetails.getTradeMark().addAll(tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetailsTradeMark);
            tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionData.setTradeMarkDetails(tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetails);
            tradeMarkTransactionBodyValueVal1TransactionContentDetails.setTransactionData(tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionData);
            tradeMarkTransactionBodyValueVal1.setTransactionContentDetails(tradeMarkTransactionBodyValueVal1TransactionContentDetails);
            tradeMarkTransactionBodyValue.add(tradeMarkTransactionBodyValueVal1);
            tradeMarkTransactionBody.value = tradeMarkTransactionBodyValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.bg.bpo.register.search.BPORegisterSearch#getMarkByAppNum(java.lang.String  appnum ,)bg.egov.regix.patentdepartment.TransactionHeaderType  transactionHeader ,)java.util.List<bg.egov.regix.patentdepartment.TransactionBodyType>  tradeMarkTransactionBody )*
     */
    public void getMarkByAppNum(java.lang.String appnum,javax.xml.ws.Holder<bg.egov.regix.patentdepartment.TransactionHeaderType> transactionHeader,javax.xml.ws.Holder<java.util.List<bg.egov.regix.patentdepartment.TransactionBodyType>> tradeMarkTransactionBody) { 
        LOG.info("Executing operation getMarkByAppNum");
        System.out.println(appnum);
        try {
            bg.egov.regix.patentdepartment.TransactionHeaderType transactionHeaderValue = new bg.egov.regix.patentdepartment.TransactionHeaderType();
            bg.egov.regix.patentdepartment.TransactionHeaderType.SenderDetails transactionHeaderValueSenderDetails = new bg.egov.regix.patentdepartment.TransactionHeaderType.SenderDetails();
            transactionHeaderValueSenderDetails.setRequestProducer("RequestProducer266811698");
            transactionHeaderValueSenderDetails.setRequestProducerDateTime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2015-06-18T18:41:10.061+03:00"));
            transactionHeaderValue.setSenderDetails(transactionHeaderValueSenderDetails);
            transactionHeader.value = transactionHeaderValue;
            java.util.List<bg.egov.regix.patentdepartment.TransactionBodyType> tradeMarkTransactionBodyValue = new java.util.ArrayList<bg.egov.regix.patentdepartment.TransactionBodyType>();
            bg.egov.regix.patentdepartment.TransactionBodyType tradeMarkTransactionBodyValueVal1 = new bg.egov.regix.patentdepartment.TransactionBodyType();
            bg.egov.regix.patentdepartment.TransactionBodyType.TransactionErrorDetails tradeMarkTransactionBodyValueVal1TransactionErrorDetails = new bg.egov.regix.patentdepartment.TransactionBodyType.TransactionErrorDetails();
            java.util.List<bg.egov.regix.patentdepartment.TransactionErrorType> tradeMarkTransactionBodyValueVal1TransactionErrorDetailsTransactionError = new java.util.ArrayList<bg.egov.regix.patentdepartment.TransactionErrorType>();
            tradeMarkTransactionBodyValueVal1TransactionErrorDetails.getTransactionError().addAll(tradeMarkTransactionBodyValueVal1TransactionErrorDetailsTransactionError);
            tradeMarkTransactionBodyValueVal1.setTransactionErrorDetails(tradeMarkTransactionBodyValueVal1TransactionErrorDetails);
            bg.egov.regix.patentdepartment.TransactionBodyType.TransactionContentDetails tradeMarkTransactionBodyValueVal1TransactionContentDetails = new bg.egov.regix.patentdepartment.TransactionBodyType.TransactionContentDetails();
            tradeMarkTransactionBodyValueVal1TransactionContentDetails.setTransactionIdentifier("TransactionIdentifier948237369");
            tradeMarkTransactionBodyValueVal1TransactionContentDetails.setTransactionCode("TransactionCode-1036807088");
            bg.egov.regix.patentdepartment.TransactionDataType tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionData = new bg.egov.regix.patentdepartment.TransactionDataType();
            bg.egov.regix.patentdepartment.TransactionDataType.TradeMarkDetails tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetails = new bg.egov.regix.patentdepartment.TransactionDataType.TradeMarkDetails();
            java.util.List<bg.egov.regix.patentdepartment.TradeMarkType> tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetailsTradeMark = new java.util.ArrayList<bg.egov.regix.patentdepartment.TradeMarkType>();
            tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetails.getTradeMark().addAll(tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetailsTradeMark);
            tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionData.setTradeMarkDetails(tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionDataTradeMarkDetails);
            tradeMarkTransactionBodyValueVal1TransactionContentDetails.setTransactionData(tradeMarkTransactionBodyValueVal1TransactionContentDetailsTransactionData);
            tradeMarkTransactionBodyValueVal1.setTransactionContentDetails(tradeMarkTransactionBodyValueVal1TransactionContentDetails);
            tradeMarkTransactionBodyValue.add(tradeMarkTransactionBodyValueVal1);
            tradeMarkTransactionBody.value = tradeMarkTransactionBodyValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
