/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufba.sw.ontol;

import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;

/**
 *
 * @author brennomello
 */
public class mainOntol {
    
    public static void main(String [] args){
        OntModel m = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
        System.out.print(OntModelSpec.OWL_MEM);
    }
}
