import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="IDNumber")
@XmlRootElement
public class IDNumber {
	
	enum VerificationStatus {
		INVALID, VALID;
	}
	
//	@XmlJavaTypeAdapter(VerificationStatusAdapter.class)
	private VerificationStatus status;

	public IDNumber() {}
	
	public IDNumber(VerificationStatus status) {
		this.status = status;
	}
	
	public VerificationStatus getStatus() {
		return status;
	}

	public void setStatus(VerificationStatus status) {
		this.status = status;
	}

}
