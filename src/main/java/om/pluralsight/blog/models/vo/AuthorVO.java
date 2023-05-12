package om.pluralsight.blog.models.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorVO {

	private String name;
	private String email;
	private String contactNumber;
	
}
