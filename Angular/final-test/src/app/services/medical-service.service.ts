import {Injectable} from '@angular/core';
import {MedicalRecord} from '../models/medical-record';
import {Subject} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MedicalServiceService {
  MedicalRecords: MedicalRecord[] = [
    {
      idRecord: 'BA-001',
      patientId: 'BN-435',
      patientName: 'Nguyễn Văn A',
      startIn: new Date('07-08-2016'),
      startOut: new Date('08-08-2019'),
      reason: 'Ung thư gan giai đoạn cuối',
      treatmentMethods: 'Mổ',
      doctorName: 'Lê Văn B'
    },
    {
      idRecord: 'BA-112',
      patientId: 'BN-123',
      patientName: 'Nguyễn Văn C',
      startIn: new Date('10-08-2019'),
      startOut: new Date('10-08-2020'),
      reason: 'Suy thận mạn',
      treatmentMethods: 'Chạy thận',
      doctorName: 'Nguyễn Đôn D'
    },
    {
      idRecord: 'BA-223',
      patientId: 'BN-984',
      patientName: 'Tôn Nữ D',
      startIn: new Date('11-01-2020'),
      startOut: new Date('08-08-2020'),
      reason: 'Covid-2019',
      treatmentMethods: 'Cách ly và theo dõi thường xuyên',
      doctorName: 'La Văn N'
    },
    {
      idRecord: 'BA-444',
      patientId: 'BN-153',
      patientName: 'Đoàn Thị E',
      startIn: new Date('07-08-2017'),
      startOut: new Date('08-08-2018'),
      reason: 'Ung thư phổi giai đoạn cuối',
      treatmentMethods: 'Xạ trị',
      doctorName: 'Lê Văn B'
    }];
  deleteEmit = new Subject();

  constructor() {
  }

  getAllMedicalRecords() {
    return this.MedicalRecords;
  }

  saveMedicalRecord(medicalRecord: MedicalRecord) {
    this.MedicalRecords.push(medicalRecord);
  }

  findRecordByIdRecord(idrecord: string) {
    return this.MedicalRecords.find(value => value.idRecord === idrecord);
  }

  deleteRecordByIdRecord(idrecord: string) {
    this.MedicalRecords = this.MedicalRecords.filter(value => value.idRecord !== idrecord);
  }
  editRecordById(id: string, record: MedicalRecord) {
    for (let i = 0; i < this.MedicalRecords.length; i++) {
      if (this.MedicalRecords[i].idRecord === id) {
        this.MedicalRecords[i] = record;
      }
    }
  }
}
