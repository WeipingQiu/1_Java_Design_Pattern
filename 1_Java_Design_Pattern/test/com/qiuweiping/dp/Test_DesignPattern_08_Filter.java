package com.qiuweiping.dp;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qiuweiping.dp_08_filter.foundation.AndCriteria;
import com.qiuweiping.dp_08_filter.foundation.Criteria;
import com.qiuweiping.dp_08_filter.foundation.CriteriaFemale;
import com.qiuweiping.dp_08_filter.foundation.CriteriaMale;
import com.qiuweiping.dp_08_filter.foundation.CriteriaSingle;
import com.qiuweiping.dp_08_filter.foundation.OrCriteria;
import com.qiuweiping.dp_08_filter.foundation.Person;
import com.qiuweiping.util.Trace;

public class Test_DesignPattern_08_Filter {

	private List<Person> persons;
	private Trace trace = Trace.getInstance();
	
	@Before
	public void beforeTest() {
		persons = new ArrayList<Person>();
		persons.add(new Person("anna", "female", "single"));
		persons.add(new Person("anna2", "male", "Married"));
		persons.add(new Person("anna3", "female", "Married"));
		persons.add(new Person("anna4", "male", "single"));
		persons.add(new Person("anna5", "female", "Married"));
		persons.add(new Person("anna6", "male", "single"));
		persons.add(new Person("anna7", "female", "Married"));
		persons.add(new Person("anna8", "male", "single"));
		persons.add(new Person("anna9", "female", "Married"));
		
	}
	
	@After
	public void afterTest() {
		persons = null;
		System.gc();
	}
	
	@Test
	public void testMaleFilter() {
		Criteria male = new CriteriaMale();
		List<Person> result = male.meetCriteria(persons);
		display(result);
	}
	
	@Test
	public void testFeMaleFilter() {
		Criteria female = new CriteriaFemale();
		List<Person> result = female.meetCriteria(persons);
		trace.log("Male:\n");
		display(result);
	}
	
	@Test
	public void testSingleFilter() {
		Criteria single = new CriteriaSingle();
		List<Person> result = single.meetCriteria(persons);
		trace.log("Single:\n");
		display(result);
	}
	
	@Test
	public void testSingleOrFemaleFilter() {
		Criteria single = new CriteriaSingle();
		Criteria female = new CriteriaFemale();
		Criteria singleOrFemale = new OrCriteria(female, single);
		List<Person> result = singleOrFemale.meetCriteria(persons);
		trace.log("Single OR Female\n");
		display(result);
	}
	
	@Test
	public void testSingleAndMaleFilter() {
		Criteria single = new CriteriaSingle();
		Criteria male = new CriteriaMale();
		Criteria singleOrFemale = new AndCriteria(male, single);
		List<Person> result = singleOrFemale.meetCriteria(persons);
		trace.log("Single AND Male\n");
		display(result);
	}
	
	private void display(List<Person> persons) {
		for(Person person: persons) {
			trace.log("Person:["+person.getName() +", Gender:"+ person.getGender() 
					+", Marital Status:"+person.getMaritalStatus()+"]\n");
		}
	}
}
