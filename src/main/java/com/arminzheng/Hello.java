package com.arminzheng;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

@Mojo(name = "hello", defaultPhase = LifecyclePhase.CLEAN)
public class Hello extends AbstractMojo {

  @Parameter private String name;

  @Parameter(defaultValue = "World")
  protected List<String> messages;

  @Parameter(property = "hello.args")
  private String args;

  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {
    System.out.println("hello plugin's name:" + name);
    System.out.println("hello plugin's messages: " + messages);
    System.out.println("hello plugin's args:" + args);
  }
}
