package AmitRest;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/amit/")
public class V1_status {

	@GET	
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "title";
	}
	
	@GET	
	@Produces(MediaType.TEXT_HTML)
	@Path("/version")
	public String returnVersion() {
		return "version: 1";
	}
	
	
}
