package patientintake;

import org.junit.jupiter.api.Test;
import static org.junit.jupiterapi.Assertions*;

class ClinicCalendarShould {
    @Test
     void allowEntryOfAnAppointment() {//give method a name //second time can remove public because test and class are at same level
        ClinicCalendar calendar = new ClinicCalendar();                   //create an instance of the claendar class
        calendar.addAppointment("Jim","Weaver","avery","09/01/2018 2:00 pm"); //enter same data added in console manually here
        List<PatientAppointment> appointments = calendar.getAppointments                  //now verify results //this list should containt the new appointments
        assertNotNull(appointments);//verify  not null
        assertEquals(1,appointments.size()); //check and make sure we get back exactly one input from the calendar
        //next we add and verify all the values entered are being added to the calendar
        PatientAppointmentent enteredAppt = appointments.get(0);
        assertEquals("Jim", enteredAppt.getPatientFirstName());
        assertEquals("Weaver", enteredAppt.getPatientLastName());
        assertEquals(Doctor.avery, enteredAppt.getDoctor());
        assertEquals("9/1/2018 02:00 PM",
                enteredAppt.getAppointmentDateTime().format(DateTimeFormatter.ofPattern("M/d/yyyy hh:mm a")));
    }

}
