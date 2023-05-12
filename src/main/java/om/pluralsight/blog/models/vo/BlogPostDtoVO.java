package om.pluralsight.blog.models.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogPostDtoVO {

	private String blogPostTitle;
	private String blogPostDescription;
	private Date blogPostCreatedDate;
	private Date blogPostUpdateDate;

	private AuthorVO author;
}
