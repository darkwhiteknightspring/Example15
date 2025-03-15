package com.example.eazyschool.model;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

/*
	Lombok annotations

	@NoArgsConstructor
	@AllArgsConstructor
	@RequiredArgsConstructor (create constructor for final fields)
	@Getter
	@Setter
	@ToString
	@EqualsAndHashCode
	@Data (equal all annotation except 1 and 2)

	@Slf4j (create logger object)

*/


/*

Jakarta.validation.constraints.*


@Digits
@Email
@Max
@Min
@NotBlank
@NotEmpty
@NotNull
@Pattern
@Size


org.hibernate.validator.constraints.*

@CreditCardNumber
@Length
@Currency
@Range
@URL
@UniqueElements
@EAN
@ISBN

 */


@Data
public class Contact {

    /*
  @NotNull: Checks if a given field is not null but allows empty values & zero elements inside collections.
  @NotEmpty: Checks if a given field is not null and its size/length is greater than zero.
  @NotBlank: Checks if a given field is not null and trimmed length is greater than zero.
 */

    @NotBlank(message="Name must not be blank.")
    @Size(min=3,message="Name must be atleast 3 characters long.")
    private String name;

    @NotBlank(message="Mobile number must not be blank")
    @Pattern(regexp="(^$|[0-9]{10})",message="Mobile number must be 10 digits long.")
    private String mobileNum;

    @NotBlank(message="Email must not be blank.")
    @Email(message="Please provide a valid email address.")
    private String email;

    @NotBlank(message="Subject should not be blank.")
    @Size(min=5,message="Subject must be at least 5 characters long.")
    private String subject;

    @NotBlank(message="Message must not be blank.")
    @Size(min=10,message="Message must be atleast 10 characters long.")
    private String message;

}
