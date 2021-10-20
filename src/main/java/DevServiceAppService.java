import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DevServiceAppService {
	private static final Logger LOG = LoggerFactory.getLogger("dev.console");

	public void executer(String param) {
		LOG.warn("Traitement 1 : param = {}", param);

	}

}
