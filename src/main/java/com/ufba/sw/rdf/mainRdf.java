/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufba.sw.rdf;


import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.vocabulary.VCARD;

/**
 *
 * @author brennomello
 */
public class mainRdf {
  


  public static void main(String [] args){
    /*  
    // some definitions
    String personURI = "http://somewhere/JohnSmith";
    String fullName  = "John Smith";

    // create an empty Model
    Model model = ModelFactory.createDefaultModel();

    // create the resource
    Resource johnSmith = model.createResource(personURI);

    // add the property
    johnSmith.addProperty(VCARD.FN, fullName); 
    */
            
            
    // some definitions
    String personURI    = "http://somewhere/JohnSmith";
    String givenName    = "John";
    String familyName   = "Smith";
    String fullName     = givenName + " " + familyName;

    // create an empty Model
    Model model = ModelFactory.createDefaultModel();

    // create the resource
    //   and add the properties cascading style
    Resource johnSmith = model.createResource(personURI)
         .addProperty(VCARD.FN, fullName).addProperty(VCARD.N, model.createResource().addProperty(VCARD.Given, givenName).addProperty(VCARD.Family, familyName));
  
    // list the statements in the Model
      StmtIterator iter = model.listStatements();

    // print out the predicate, subject and object of each statement
    while (iter.hasNext()) {
        Statement stmt      = iter.nextStatement();  // get next statement
        Resource  subject   = stmt.getSubject();     // get the subject
        Property  predicate = stmt.getPredicate();   // get the predicate
        RDFNode   object    = stmt.getObject();      // get the object

        System.out.print(subject.toString());
        System.out.print(" " + predicate.toString() + " ");
        if (object instanceof Resource) {
           System.out.print(object.toString());
        } else {
            // object is a literal
            System.out.print(" \"" + object.toString() + "\"");
        }

            System.out.println(" .");
        } 

    
  }
 
}
