package chatbot;


import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"title",
"value",
"short"
})
public class Field {

@JsonProperty("title")
private String title;
@JsonProperty("value")
private String value;
@JsonProperty("short")
private Boolean _short;

/**
* 
* @return
* The title
*/
@JsonProperty("title")
public String getTitle() {
return title;
}

/**
* 
* @param title
* The title
*/
@JsonProperty("title")
public void setTitle(String title) {
this.title = title;
}

/**
* 
* @return
* The value
*/
@JsonProperty("value")
public String getValue() {
return value;
}

/**
* 
* @param value
* The value
*/
@JsonProperty("value")
public void setValue(String value) {
this.value = value;
}

/**
* 
* @return
* The _short
*/
@JsonProperty("short")
public Boolean getShort() {
return _short;
}

/**
* 
* @param _short
* The short
*/
@JsonProperty("short")
public void setShort(Boolean _short) {
this._short = _short;
}

}