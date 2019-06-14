
public class StringBoosted {

	public String stringcode(String str) {
		// TODO Auto-generated method stub
		if(str.length()<2){
			return str.replaceAll("A","");
		}
		String f2ch=str.substring(0,2);
		String rem=str.substring(2);
		return f2ch.replaceAll("A","")+rem;
	}

}
