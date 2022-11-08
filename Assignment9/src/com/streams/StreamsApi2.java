package com.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamsApi2 {

	public static void main(String[] args) {
		List<News>lis = Arrays.asList(
				new News (01,"Shalu","Meera","Budget is so high"),
				new News (01,"Vasavi","Meera","is so high"),
				new News (02,"Shalini","Meera","high"),
				new News (02,"Niki","Shravani","Budget is medium"),
				new News (05,"Shalu","Meera","Budget is so high"),
				new News (04,"Shalu","Mithra","How are you"),
				new News (02,"Shalu","Mani","This is the fact"),
				new News (01,"Shalu","Mahi","But what to do")
				);
		Collections.sort(lis, (obj1,obj2)->obj1.getNewsId().compareTo(obj2.getNewsId()));
		lis.stream().max((p1,p2)->p1.getNewsId());

	}

}
