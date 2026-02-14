package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Page1 {

	public static void main(String[] args) {
		String s="Hii";	
		String vow=s.chars().mapToObj(c->{char ch=(char)c; return ch;}).map(String::valueOf).filter(x->"aeiou".contains(x)).collect(Collectors.joining());
		System.out.println(vow);
//		String res=s.chars().mapToObj(c->{char ch=(char)c;
//		return Character.toLowerCase(ch);}).map(String::valueOf).collect(Collectors.joining());
//		System.out.println(res);
//		Map<Character,Long>mp=s.chars().mapToObj(c->{char ch=(char)c; return ch;}).collect(Collectors.groupingBy(c->c, Collectors.counting())); ----->map by grouping
//		IntStream.rangeClosed(2, 5).filter(Page1::prime).toList();
//		List<String> l=Arrays.asList("sai","pl");
//		Map<String,Integer>mp=l.stream().collect(Collectors.toMap(x->x, x->x.length()));-----> two are Object type
//		System.out.println(mp);
//		List<Integer> l=Arrays.asList(1,9,8);
//		int v=l.stream().reduce(0,(x,y)->x+y).intValue();
//		int k=l.stream().min((a,b)->a>b?1:0).get();
//		l.stream().sorted(Comparator.reverseOrder()).toList();
//		List<String>a=Arrays.asList("av","zv","abc");
//		Map<Boolean,Map<Integer,List<String>>>mp=a.stream().collect(Collectors.partitioningBy(x->x.length()%2==0,Collectors.groupingBy(String::length)));---> making collection to two parts
//		System.out.println(mp);
//		a.stream().sorted(Comparator.comparing(String::length).thenComparing(Comparator.reverseOrder())).forEach(System.out::println);

	}

}
