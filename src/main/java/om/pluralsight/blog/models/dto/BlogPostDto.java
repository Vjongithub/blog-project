package om.pluralsight.blog.models.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "blog_post")
public class BlogPostDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long it;
	
	@Column(name="blog_post_title")
	private String blogPostTitle;
	
	@Column(name="blog_post_description")
	private String blogPostDescription;
	
	@Column(name="blog_post_created_dt")
	private Date blogPostCreatedDate;
	
	@Column(name="blog_post_updated_dt")
	private Date blogPostUpdateDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id")
	private AuthorDto author;
}
