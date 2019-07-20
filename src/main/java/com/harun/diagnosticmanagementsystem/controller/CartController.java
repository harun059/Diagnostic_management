/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harun.diagnosticmanagementsystem.controller;

import com.harun.diagnosticmanagementsystem.dao.MedecinegroupService;
import com.harun.diagnosticmanagementsystem.dao.MedecinelistService;
import com.harun.diagnosticmanagementsystem.dao.MedecinetypeService;
import com.harun.diagnosticmanagementsystem.dao.PrescriptiondrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Another User
 */
@Controller
public class CartController {
    
    @Autowired
    MedecinegroupService mgs;
    @Autowired
    MedecinetypeService mts;
    @Autowired
    MedecinelistService mls;
    @Autowired
    PrescriptiondrugService pds;
    
}
