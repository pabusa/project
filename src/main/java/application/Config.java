package application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@Data
@EnableConfigurationProperties
@ConfigurationProperties("demo")
public class Config {
	
	@Value("${demo.name}")
	private String name;
	
	@Value("${demo.select_proposal_header}")
	private String selectProposalHeader;

	@Value("${demo.from_proposal_header}")
	private String fromProposalHeader;

	@Value("${demo.join_sf_on_adv_sec_filter}")
	private String joinSfOnAdvSecurityFilter;

	@Value("${demo.join_sf_on_rm_sec_filter}")
	private String joinSfOnRmSecurityFilter;

	@Value("${demo.join_sf_on_user}")
	private String joinSfOnUser;

	@Value("${demo.where_sf}")
	private String whereSf;

	@Value("${demo.and_tipo_rol_adv}")
	private String andTipoRolAdv;
	
	@Value("${demo.and_tipo_rol_rm}")
	private String andTipoRolRm;
	
	public String getQueryProposalHeaderForAdv() {
	String queryProposalHeaderForAdv = ""
			+ selectProposalHeader
			+ fromProposalHeader 
			+ joinSfOnAdvSecurityFilter
			+ joinSfOnUser
			+ whereSf 
			+ andTipoRolAdv;
	  return queryProposalHeaderForAdv;
	}
	
	public String getQueryProposalHeaderForRm() {
		String queryProposalHeaderForRm = ""
				+ selectProposalHeader
				+ fromProposalHeader 
				+ joinSfOnRmSecurityFilter
				+ joinSfOnUser
				+ whereSf 
				+ andTipoRolRm;
		
		return queryProposalHeaderForRm;
	}
	

}
