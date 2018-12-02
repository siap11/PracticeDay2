import java.util.ArrayList;

public class GitHubPracDay2{

	public static ArrayList<Integer> convertIntToArrayList(int num){
		ArrayList<Integer> array = new ArrayList<Integer>();
		String temp = Integer.toString(num);
		for(int i =0; i < temp.length(); i++){
			array.add(i, temp.charAt(i) - '0');
		}
		return array;
	}



	public static void main(String[]args){

		System.out.println(convertIntToArrayList(792578));
		System.out.println(convertIntToArrayList(12345));




	}

}