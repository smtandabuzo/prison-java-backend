package com.example.prison.controller;

import com.example.prison.model.Case;
import com.example.prison.model.Court;
import com.example.prison.model.Prisoner;
import com.example.prison.model.Transfer;
import com.example.prison.repository.CaseRepository;
import com.example.prison.repository.CourtRepository;
import com.example.prison.repository.PrisonerRepository;
import com.example.prison.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

/**
 * Created by smtandabuzo on 2019/09/10.
 */
@RestController
@RequestMapping("prison-backend")
public class PrisonController {

    @Autowired
    PrisonerRepository prisonerRepository;

    @Autowired
    CourtRepository courtRepository;

    @Autowired
    CaseRepository caseRepository;

    @Autowired
    TransferRepository transferRepository;

    @GetMapping("/prisoners")
    public List<Prisoner> getPrisoners(){
        List<Prisoner> prisonerList = prisonerRepository.findAll();
        return prisonerList;
    }

    @PostMapping("/prisoners")
    @ResponseBody
    public Prisoner addPrisoner(@RequestBody Prisoner newPrisoner){
      String id = String.valueOf(new Random().nextInt());
      Prisoner prisoner = new Prisoner(id, newPrisoner.getNationalID(), newPrisoner.getFirstname(),
              newPrisoner.getLastname(), newPrisoner.getDateOfBirth(),
              newPrisoner.getPrison(), newPrisoner.getGender(), newPrisoner.getEducation(), newPrisoner.getStatus(),
              newPrisoner.getOffence(), newPrisoner.getDateIn(), newPrisoner.getFileNumber());
      prisonerRepository.insert(prisoner);
      return prisoner;
    }

    @GetMapping("/court")
    public List<Court> getCourt(){
        List<Court> courtList = courtRepository.findAll();
        return courtList;
    }

    @PostMapping("/court")
    @ResponseBody
    public Court addCourt(@RequestBody Court newCourt){
        String id = String.valueOf(new Random().nextInt());
        Court court = new Court(id,
                newCourt.getCourtDate(),
                newCourt.getCourtName(),
                newCourt.getPresidingJudge(), newCourt.getAttorney());
        courtRepository.insert(court);
        return court;
    }

    @GetMapping("/case")
    public List<Case> getCase(){
        List<Case> caseList = caseRepository.findAll();
        return caseList;
    }

    @PostMapping("/case")
    @ResponseBody
    public Case addCase(@RequestBody Case newCase){
        String id = String.valueOf(new Random().nextInt());
        Case addedCase = new Case(id,
                newCase.getCaseNumber(),
                newCase.getCaseOutcome(),
                newCase.getPrisonerName(),
                newCase.getOffence());
        caseRepository.insert(addedCase);
        return addedCase;
    }

    @GetMapping("/transfer")
    public List<Transfer> getTransfer(){
        List<Transfer> transferList = transferRepository.findAll();
        return transferList;
    }

    @PostMapping("/transfer")
    @ResponseBody
    public Transfer addTransfer(@RequestBody Transfer newTransfer){
        String id = String.valueOf(new Random().nextInt());
        Transfer transfer = new Transfer(id, newTransfer.getNationalID(),
                newTransfer.getFileNumber(), newTransfer.getToPrison(),
                newTransfer.getTransferDate(), newTransfer.getArrivalDate(),
                newTransfer.getReceivingOfficer(), newTransfer.getReleasingOfficer(),
                newTransfer.getFromPrison(), newTransfer.getToPrison(),
                newTransfer.getPrisonerName());
        transferRepository.insert(transfer);
        return transfer;
    }

}
