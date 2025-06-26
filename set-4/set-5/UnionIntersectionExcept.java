/*
   3: Find the union intersection of two list and 
   also find except (remove even elements from list1 and odd elements from list2) Input
List 1: 1,3,4,5,6,8,9
List 2: 1, 5,8,9,2

Union: 1, 3,4,5,6,8,9,2
Intersection: 1,5,8,9
Except: 1, 3, 5,9,8,2 
 */


package set_5;
import java.util.*;
public class UnionIntersectionExcept {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,3,4,5,6,8,9);
		List<Integer> list2=Arrays.asList(1,5,8,9,2);
		 Union( list1,list2);
		 intersection( list1,list2);
		 except( list1,list2);
		
	}
	public static void Union(List<Integer> list1,List<Integer> list2) {
		List<Integer> union=new ArrayList<>();
		for(int num:list1) {
			if(!union.contains(num))
			    union.add(num);
		}
		for(int num:list2) {
			if(!union.contains(num))
			    union.add(num);
		}
			
		
		System.out.println(union);
	}
	public static void intersection(List<Integer> list1,List<Integer> list2) {
		List<Integer> intersection=new ArrayList<>();
		
		for(int num:list1) {
			if(list2.contains(num) && !intersection.contains(num)) {
				intersection.add(num);
			}
			
		}
		System.out.println(intersection);

	}

	
	
	public static void except(List<Integer> list1,List<Integer> list2) {
		List<Integer> except=new ArrayList<>();
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i)%2!=0) {
				except.add(list1.get(i));
			}
		}
			for(int j=0;j<list2.size();j++) {
				if(list2.get(j)%2==0) {
					except.add(list2.get(j));
				}
				
			}
			
		
		System.out.println(except);
	}
	}
	
	

