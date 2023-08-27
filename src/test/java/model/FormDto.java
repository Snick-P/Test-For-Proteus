package model;

import lombok.Data;
import lombok.NonNull;

@Data
public class FormDto {

    @NonNull
    public String email;
    @NonNull
    public String name;
    @NonNull
    public String gender;
    public String option1;
    public String option2;

}
