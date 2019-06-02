package com.ahasan.java8;

import java.util.Optional;

public class OptionalBasicExample {
	public static void main(String[] args) {
		Optional<String> gender = Optional.of("MALE");
		String answer1="YES";
		String answer2=null;
		
		System.out.println("Non Empty Optional : "+gender);
		System.out.println("Non Empty Optional : Gender Value : "+gender.get());
		System.out.println("Empty Optional : "+Optional.empty());

		System.out.println("OfNullable of non empty string : "+Optional.ofNullable(answer1));
		System.out.println("OfNullable of empty string : "+Optional.ofNullable(answer2));
		
		//java.lang.NullPointerException
		//System.out.println("ofNullable on Non-Empty Optional : "+Optional.of(answer2));
		
		Optional<String> nonEmptyGender = Optional.of("male");
        Optional<String> emptyGender = Optional.empty();

        System.out.println("Non-Empty Optional:: " + nonEmptyGender.map(String::toUpperCase));
        System.out.println("Empty Optional    :: " + emptyGender.map(String::toUpperCase));

        Optional<Optional<String>> nonEmptyOtionalGender = Optional.of(Optional.of("male"));
        System.out.println("Optional value   :: " + nonEmptyOtionalGender);
        System.out.println("Optional.map     :: " + nonEmptyOtionalGender.map(gdr -> gdr.map(String::toUpperCase)));
        System.out.println("Optional.flatMap :: " + nonEmptyOtionalGender.flatMap(gdr -> gdr.map(String::toUpperCase)));
        System.out.println("Optional.flatMap :: " + nonEmptyOtionalGender.flatMap(gdr -> gdr.map(String::toUpperCase)).get());
        
        //Filter on Optional
        System.out.println(gender.filter(g -> g.equals("male"))); //Optional.empty
        System.out.println(gender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional[MALE]
        System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional.empty
        
        if (gender.isPresent()) {
            System.out.println("Value available.");
        } else {
            System.out.println("Value not available.");
        }

        gender.ifPresent(g -> System.out.println("In gender Option, value available."));

        //condition failed, no output print
        emptyGender.ifPresent(g -> System.out.println("In emptyGender Option, value available."));
		
        System.out.println(gender.orElse("<N/A>")); //MALE
        System.out.println(emptyGender.orElse("<N/A>")); //<N/A>

        System.out.println(gender.orElseGet(() -> "<N/A>")); //MALE
        System.out.println(emptyGender.orElseGet(() -> "<N/A>")); //<N/A>
	}
}
