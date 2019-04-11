package iSoccer2;

public enum SupportPlans implements SupportStrategy{
	
	JUNIOR{

		@Override
		public double getPlanValue(SupportPlans plan) {
			return Support.getJunior();
		}
		
	},
	
	SENIOR{

		@Override
		public double getPlanValue(SupportPlans plan) {
			return Support.getSenior();
		}
		
	},
	
	ELITE{

		@Override
		public double getPlanValue(SupportPlans plan) {
			return Support.getElite();
		}
		
	};
}
