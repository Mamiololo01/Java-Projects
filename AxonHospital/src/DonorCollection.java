import java.util.ArrayList;

public class DonorCollection {
    // create array list
    ArrayList<Donor> donors = new ArrayList<>();
    //create two classes add and display
    public void addDonor(String fname, String lname, String phone, String group, int age, String city){
        Donor donor = new Donor(fname, lname, phone, group, age ,city);
        donors.add(donor);
        System.out.println("Donor Added Successfully with ID : "+donor.getRegistrationId());
    }
    public void dispDonor() {
        System.out.println("ID\tFirst\tLast\tContact No\tBlood\tAge\tCity");
        for (Donor d : donors) {
            System.out.println(d.getRegistrationId()+"\t"+d.getFirstName()+"\t"+d.getLastName()+"\t"+d.getMobileNo()+"\t"+d.getBloodGroup()+"\t\t"+d.getAge()+"\t"+d.getCity());
        }
    }
}


