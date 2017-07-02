/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufba.sw.rdf;


import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.VCARD;

/**
 *
 * @author brennomello
 */
public class mainRdf {
  


  public static void main(String [] args){

    // some definitions
    String personURI = "http://somewhere/JohnSmith";
    String fullName  = "John Smith";

    // create an empty Model
    Model model = ModelFactory.createDefaultModel();

    // create the resource
    Resource johnSmith = model.createResource(personURI);

    // add the property
    johnSmith.addProperty(VCARD.FN, fullName); 
  }
 
}
