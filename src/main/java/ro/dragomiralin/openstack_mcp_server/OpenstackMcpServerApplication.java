package ro.dragomiralin.openstack_mcp_server;

import java.util.List;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ro.dragomiralin.openstack_mcp_server.service.OpenStackCommander;

@SpringBootApplication
public class OpenstackMcpServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenstackMcpServerApplication.class, args);
	}

	@Bean
	public ToolCallbackProvider openstackTools(OpenStackCommander openStackCommander) {
		return MethodToolCallbackProvider.builder()
			.toolObjects(openStackCommander)
			.build();
	}

}
