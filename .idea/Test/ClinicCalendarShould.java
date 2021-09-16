package patientintake;

import org.junit.jupiter.api.Test;
import static org.junit.jupiterapi.Assertions*;

class ClinicCalendarShould {
    @Test
    public void allowEntryOfAnAppointment() {//give method a name
        ClinicCalendar calendar = new ClinicCalendar();                   //create an instance of the claendar class
        calendar.addAppointment("Jim","Weaver","avery","09/01/2018 2:00 pm"); //enter same data added in console manually here
        List<PatientAppointment> appointments = calendar.getAppointments                  //now verify results //this list should containt the new appointments
        assertNotNull(appointments);//verify  not null
        assertEquals(1,appointments.size()); //check and make sure we get back exactly one input from the calendar
    }

}
