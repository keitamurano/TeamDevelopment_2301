package com.example.demo.form;
import javax.validation.constraints.NotNull;

import lombok.Data;
@Data
public class PrefecturesForm {

       @NotNull
       private String code;

       @NotNull
       private String name;

	}

