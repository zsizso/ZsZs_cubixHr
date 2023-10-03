package hu.cubix.hr.zszs.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "hr")
@Component
public class HrConfigProperties {
	
	private PayRaise payRaise;
	


	public PayRaise getPayRaise() {
		return payRaise;
	}



	public void setPayRaise(PayRaise payRaise) {
		this.payRaise = payRaise;
	}



	public static class PayRaise{
		
		private Smart smart;
		
	
		public Smart getSmart() {
			return smart;
		}


		public void setSmart(Smart smart) {
			this.smart = smart;
		}


		public static class Smart{
			private float lowWorkYears;
			private float middleWorkYears;
			private float highWorkYears;
			private int defaultPercent;
			private int lowPercent;
			private int middlePercent;
			private int highPercent;
			
			public float getLowWorkYears() {
				return lowWorkYears;
			}
			public void setLowWorkYears(float lowWorkYears) {
				this.lowWorkYears = lowWorkYears;
			}
			public float getMiddleWorkYears() {
				return middleWorkYears;
			}
			public void setMiddleWorkYears(float middleWorkYears) {
				this.middleWorkYears = middleWorkYears;
			}
			public float getHighWorkYears() {
				return highWorkYears;
			}
			public void setHighWorkYears(float highWorkYears) {
				this.highWorkYears = highWorkYears;
			}
			public int getDefaultPercent() {
				return defaultPercent;
			}
			public void setDefaultPercent(int defaultPercent) {
				this.defaultPercent = defaultPercent;
			}
			public int getLowPercent() {
				return lowPercent;
			}
			public void setLowPercent(int lowPercent) {
				this.lowPercent = lowPercent;
			}
			public int getMiddlePercent() {
				return middlePercent;
			}
			public void setMiddlePercent(int middlePercent) {
				this.middlePercent = middlePercent;
			}
			public int getHighPercent() {
				return highPercent;
			}
			public void setHighPercent(int highPercent) {
				this.highPercent = highPercent;
			}
			
			
			
		}
	}

}
