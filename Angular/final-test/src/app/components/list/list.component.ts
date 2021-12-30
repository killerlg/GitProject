import {Component, OnInit} from '@angular/core';
import {MedicalRecord} from '../../models/medical-record';
import {MedicalServiceService} from '../../services/medical-service.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})

export class ListComponent implements OnInit {
  allMedicalRecords: MedicalRecord[];

  constructor(private medicalService: MedicalServiceService) {
    this.medicalService.deleteEmit.subscribe(() => {
      this.allMedicalRecords = this.medicalService.getAllMedicalRecords();
      console.log(this.medicalService.getAllMedicalRecords());
    });
  }

  ngOnInit() {
    this.getAllMedicalRecords();
  }

  getAllMedicalRecords() {
    this.allMedicalRecords = this.medicalService.getAllMedicalRecords();
  }

  delete(idRecord: string) {
    this.medicalService.deleteRecordByIdRecord(idRecord);
    this.medicalService.deleteEmit.next();
  }
}
