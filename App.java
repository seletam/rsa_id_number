import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class App {

	public static void main(String[] args) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(IDNumber.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		jaxbMarshaller.marshal(checkIDNumber("96090429630h81"), System.out); 
	}

	private static IDNumber checkIDNumber(String idNumber) {
		IDValidation idValidation = new IDValidation();
		if (idValidation.validateRSAIDNo(idNumber)) {
			return new IDNumber(IDNumber.VerificationStatus.VALID);
		}
		return new IDNumber(IDNumber.VerificationStatus.INVALID);
	}

}
