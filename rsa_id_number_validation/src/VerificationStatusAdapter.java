import javax.xml.bind.annotation.adapters.XmlAdapter;

public class VerificationStatusAdapter extends XmlAdapter<String, IDNumber.VerificationStatus> {

	@Override
	public String marshal(IDNumber.VerificationStatus status) throws Exception {
		return status.name();
	}

	@Override
	public IDNumber.VerificationStatus unmarshal(String status) throws Exception {
		return IDNumber.VerificationStatus.valueOf(status);
	}

}
