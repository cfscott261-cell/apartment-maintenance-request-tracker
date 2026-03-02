package coreyscott;
import java.util.List;

public class MaintenanceOffice {

        public void assignTech(MaintenanceRequest request) {

            if (request.getIssueSeverity() >= 4) {
                request.setStatus("IN_PROGRESS");
                System.out.println("Senior tech has been assigned.");
            } else {
                request.setStatus("IN_PROGRESS");
                System.out.println("Standard tech has been assigned.");
            }
        }

        public void closeRequest(MaintenanceRequest request) {

            if (request.getStatus().equals("DONE")) {
                System.out.println("Request closed successfully.");
            } else {
                System.out.println("Request cannot be closed unless status is DONE.");
            }
        }
    }

