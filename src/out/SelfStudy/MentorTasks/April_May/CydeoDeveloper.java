package out.SelfStudy.MentorTasks.April_May;

public class CydeoDeveloper {


        public String firstName, lastName, state, city, group;

        public void setInfo(String firstName, String lastName, String state, String city, String group) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.state = state;
            this.city = city;
            this.group = group;
        }

        public String toString() {
            return "CydeoDeveloper{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", state='" + state + '\'' +
                    ", city='" + city + '\'' +
                    ", group='" + group + '\'' +
                    '}';
        }

        public void recordFlipgrid(){

            System.out.println(firstName+" is recording FlipGrid video");

        }

        public void attendingLiveSession(){
            System.out.println(firstName+" is is attending Live session");
        }

        public void takingQuiz(){
            System.out.println(firstName+" is taking quiz");
        }

        public void attendingMentorMeeting(){
            System.out.println(firstName+" is attending Mentor Meeting");
        }

        public void doingGroupStudy(){
            System.out.println(firstName+" doing group study.");
        }
}
