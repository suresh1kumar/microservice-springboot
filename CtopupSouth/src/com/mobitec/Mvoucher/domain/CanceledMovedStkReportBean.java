package com.mobitec.Mvoucher.domain;





import java.util.Date;

import com.mobitec.Mvoucher.jsonconv.JsonConverter;

public class CanceledMovedStkReportBean {
	   
	 	private long RECORD_ID;
	 	private long SM_TRANSACTION_ID;
	 	private Date TIMESTAMP;
	 	private String dealer_code;
	    private double AMOUNT;
	 	private double BALANCE_BEFORE;
	 	private double BALANCE_AFTER;
	 	private double BALANCE_BEFORE_CANCEL;
	 	private double BALANCE_AFTER_CANCEL;
	 	private Date  CANCEL_DATE;
	 	
		public double getRECORD_ID() {
			return RECORD_ID;
		}




		public void setRECORD_ID(long rECORD_ID) {
			RECORD_ID = rECORD_ID;
		}




		public double getSM_TRANSACTION_ID() {
			return SM_TRANSACTION_ID;
		}




		public void setSM_TRANSACTION_ID(long sM_TRANSACTION_ID) {
			SM_TRANSACTION_ID = sM_TRANSACTION_ID;
		}




		public Date getTIMESTAMP() {
			return TIMESTAMP;
		}




		public void setTIMESTAMP(Date tIMESTAMP) {
			TIMESTAMP = tIMESTAMP;
		}




		public String getDealer_code() {
			return dealer_code;
		}




		public void setDealer_code(String dealer_code) {
			this.dealer_code = dealer_code;
		}




		public double getAMOUNT() {
			return AMOUNT;
		}




		public void setAMOUNT(double aMOUNT) {
			AMOUNT = aMOUNT;
		}




		public double getBALANCE_BEFORE() {
			return BALANCE_BEFORE;
		}




		public void setBALANCE_BEFORE(double bALANCE_BEFORE) {
			BALANCE_BEFORE = bALANCE_BEFORE;
		}




		public double getBALANCE_AFTER() {
			return BALANCE_AFTER;
		}




		public void setBALANCE_AFTER(double bALANCE_AFTER) {
			BALANCE_AFTER = bALANCE_AFTER;
		}




		public double getBALANCE_BEFORE_CANCEL() {
			return BALANCE_BEFORE_CANCEL;
		}




		public void setBALANCE_BEFORE_CANCEL(double bALANCE_BEFORE_CANCEL) {
			BALANCE_BEFORE_CANCEL = bALANCE_BEFORE_CANCEL;
		}




		public double getBALANCE_AFTER_CANCEL() {
			return BALANCE_AFTER_CANCEL;
		}




		public void setBALANCE_AFTER_CANCEL(double bALANCE_AFTER_CANCEL) {
			BALANCE_AFTER_CANCEL = bALANCE_AFTER_CANCEL;
		}




		public Date getCANCEL_DATE() {
			return CANCEL_DATE;
		}




		public void setCANCEL_DATE(Date cANCEL_DATE) {
			CANCEL_DATE = cANCEL_DATE;
		}




		public CanceledMovedStkReportBean() {
			super();
		}
		
		
		

		public CanceledMovedStkReportBean(long rECORD_ID, long sM_TRANSACTION_ID, Date tIMESTAMP,
				String dealer_code, double aMOUNT, double bALANCE_BEFORE, double bALANCE_AFTER,
				double bALANCE_BEFORE_CANCEL, double bALANCE_AFTER_CANCEL, Date cANCEL_DATE) {
			super();
			RECORD_ID = rECORD_ID;
			SM_TRANSACTION_ID = sM_TRANSACTION_ID;
			TIMESTAMP = tIMESTAMP;
			this.dealer_code = dealer_code;
			AMOUNT = aMOUNT;
			BALANCE_BEFORE = bALANCE_BEFORE;
			BALANCE_AFTER = bALANCE_AFTER;
			BALANCE_BEFORE_CANCEL = bALANCE_BEFORE_CANCEL;
			BALANCE_AFTER_CANCEL = bALANCE_AFTER_CANCEL;
			CANCEL_DATE = cANCEL_DATE;
		}




		@Override
	    public String toString() {
	        String json = JsonConverter.INSTANCE.asJsonString(this);
	        return json;
	    }
		
	 	
	
	 	 

}
