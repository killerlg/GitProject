export interface MedicalRecord {
  idRecord: string;
  patientId: string;
  patientName: string;
  startIn: Date;
  startOut: Date;
  reason: string;
  treatmentMethods: string;
  doctorName: string;
}
