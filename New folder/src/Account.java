
public class Account {

		String mName;
		int mMoney;
		String favColor;
		
		public Account(String[] a){
			mName = a[0];
			mMoney = Integer.parseInt(a[1]);
		}
		
		public String[] toCSVEntry(){
			
			String[] entry = new String[]{mName, Integer.toString(mMoney)};
			return entry;
		}
		
		public Account(String Name,int Money){
			mName = Name;
			mMoney = Money;
		}
}
