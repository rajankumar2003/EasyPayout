package easyPayouts;

import java.util.*;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class EasyPayOutsController {
	 private final List<Company> companies = Arrays.asList(
		        new Company("c1", "Alpha Corp"), new Company("c2", "Beta Pvt Ltd")
		    );
		    private final List<Account> accounts = Arrays.asList(
		        new Account("a1", "c1", "Alpha Savings"),
		        new Account("a2", "c1", "Alpha Current"),
		        new Account("a3", "c2", "Beta Payroll"),
		        new Account("a4", "c2", "Beta Direct")
		    );
		    @GetMapping("/companies")
		    public List<Company> getCompanies() { return companies; }

		    @GetMapping("/accounts")
		    public List<Account> getAccounts(@RequestParam String companyId) {
		        List<Account> result = new ArrayList<>();
		        for (Account acc : accounts)
		            if (acc.getCompanyId().equals(companyId)) result.add(acc);
		        return result;
		    }

		    @GetMapping("/account-data")
		    public AccountData getAccountData(@RequestParam String accountId) {
		        List<Transaction> txs;
		        double balance;
		        if ("a1".equals(accountId)) {
		            txs = Arrays.asList(
		                new Transaction("07/05/2024 01:04 PM", 21337, 21337, "1000000", "AC0CF7RRUY407QHU"),
		                new Transaction("04/05/2024 12:38 PM", 34578, 55915, "CMS4136431811", "0104SLNEFTPL"),
		                new Transaction("15/05/2024 10:01 AM", 8000, 63915, "CMS4136440001", "AC0CZZRRUY401ABC"),
		                new Transaction("18/05/2024 11:40 AM", 22000, 85915, "CMS4136450002", "UPI1234567890"),
		                new Transaction("21/05/2024 09:30 AM", 10500, 96415, "CMS4136460003", "NEFTPL23456789"),
		                new Transaction("25/05/2024 03:25 PM", 18000, 114415, "CMS4136470004", "AC0CF7RRUY409LMN")
		            );
		            balance = txs.get(txs.size() - 1).getAcBalance();
		        } else if ("a2".equals(accountId)) {
		            txs = Arrays.asList(
		                new Transaction("10/05/2024 09:14 AM", 50000, 50000, "2000011", "AC0CF7RRUY408XYZ"),
		                new Transaction("11/05/2024 03:20 PM", 52000, 102000, "CMS4145551991", "0105SLRTGHTPL"),
		                new Transaction("13/05/2024 05:07 PM", 23100, 125100, "CMS4145560002", "AC0CWWRRUY408RTY"),
		                new Transaction("16/05/2024 02:22 PM", 16100, 141200, "CMS4145570003", "UPI2345670001"),
		                new Transaction("18/05/2024 08:18 AM", 15100, 156300, "CMS4145580004", "NEFTPL99988877"),
		                new Transaction("23/05/2024 02:33 PM", 17000, 173300, "CMS4145590005", "AC0CF7RRUY408VWX")
		            );
		            balance = txs.get(txs.size() - 1).getAcBalance();
		        } else if ("a3".equals(accountId)) {
		            txs = Arrays.asList(
		                new Transaction("12/05/2024 08:10 AM", 12000, 12000, "3000002", "BETAPA567UPI"),
		                new Transaction("14/05/2024 01:45 PM", 25000, 37000, "CMS4123456789", "BETAPA567NEFT"),
		                new Transaction("17/05/2024 10:20 AM", 4000, 41000, "CMS4123467890", "UPI5678912345"),
		                new Transaction("20/05/2024 04:45 PM", 3500, 44500, "CMS4123478912", "NEFTPL45671234"),
		                new Transaction("22/05/2024 09:00 AM", 9900, 54400, "CMS4123489224", "BETAPA987NEFT"),
		                new Transaction("25/05/2024 06:30 PM", 11000, 65400, "CMS4123499236", "BETAPA567UPI")
		            );
		            balance = txs.get(txs.size() - 1).getAcBalance();
		        } else if ("a4".equals(accountId)) {
		            txs = Arrays.asList(
		                new Transaction("18/05/2024 08:20 AM", 16000, 16000, "4000002", "BETADIR890UPI"),
		                new Transaction("20/05/2024 03:15 PM", 32000, 48000, "CMS4198765432", "BETADIR890NEFT"),
		                new Transaction("21/05/2024 11:00 AM", 5700, 53700, "CMS4198771234", "BETADIR123UPI"),
		                new Transaction("24/05/2024 06:40 PM", 3400, 57100, "CMS4198787654", "NEFTPL65432109"),
		                new Transaction("26/05/2024 08:55 AM", 10700, 67800, "CMS4198798888", "BETADIR990NEFT"),
		                new Transaction("30/05/2024 12:15 PM", 7300, 75100, "CMS4198807890", "BETADIR890UPI")
		            );
		            balance = txs.get(txs.size() - 1).getAcBalance();
		        } else {
		            txs = new ArrayList<>();
		            balance = 0.0;
		        }
		        return new AccountData(accountId, balance, txs);
		    }



		    @GetMapping("/account-data1")
		    public AccountData getAccountData1(@RequestParam String accountId) {
		    	 List<Transaction> txs;
			        double balance;
			        if ("a1".equals(accountId)) {
			            txs = Arrays.asList(
			            		new Transaction("06/05/2024 01:60 PM", 34537, 34537, "1000000", "AC0CF7RRUY407QHU"),
					            new Transaction("09/05/2024 02:38 PM", 10178, 44715, "CMS4136431811", "0104SLNEFTPL")
			            );
			            balance = txs.get(1).getAcBalance();
			        } else if ("a2".equals(accountId)) {
			            txs = Arrays.asList(
			                new Transaction("10/05/2024 09:14 AM", 50000, 50000, "2000011", "AC0CF7RRUY408XYZ"),
			                new Transaction("11/05/2024 03:20 PM", 52000, 102000, "CMS4145551991", "0105SLRTGHTPL")
			            );
			            balance = txs.get(1).getAcBalance();
			        }
			        // Repeat and add for other accountIds...
			        else {
			            txs = new ArrayList<>();
			            balance = 0.0;
			        }
			        return new AccountData(accountId, balance, txs);
		      
		    }
}
