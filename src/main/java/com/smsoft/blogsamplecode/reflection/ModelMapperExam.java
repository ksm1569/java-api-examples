package com.smsoft.blogsamplecode.reflection;

import org.modelmapper.ModelMapper;

public class ModelMapperExam {
    public static void main(String[] args) {
        ModelMapper modelMapper = new ModelMapper();
        Person person = new Person("sumin", 30);
        PersonDTO personDTO = modelMapper.map(person, PersonDTO.class);

        System.out.println(personDTO);
    }
}
