package out.SelfStudy.codeWars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Persist {
	public static void main(String[] args) {

		System.out.println(persistence(999));


	}
	public static int persistence(long n) {

		long temp = n;
		String s="";
		List<Integer> list;
		int count=0;

		while(temp>9){
			s=String.valueOf(temp);
			list=Arrays.stream(s.split(""))
					.map(c->Integer.parseInt(c))
					.collect(Collectors.toList());
			temp=1;
			for (int i = 0; i < list.size(); i++) {
				temp *= list.get(i);
			}
			count++;
		}


		return count;

	}
	/*
	if (n<10){
			return 0;
		}else{
			String s = String.valueOf(n);
			List<Integer> list= Arrays.stream(s.split(""))
					.map(c->Integer.parseInt(c))
					.collect(Collectors.toList());

			int temp=1;


			for (int i = 0; i < list.size(); i++) {
				temp *= list.get(i);
			}

			while(temp>9){

				s=String.valueOf(temp);
				list=Arrays.stream(s.split(""))
						.map(c->Integer.parseInt(c))
						.collect(Collectors.toList());
				temp=1;
				for (int i = 0; i < list.size(); i++) {
					temp *= list.get(i);
				}

			}


			return temp;
		}
	 */
}