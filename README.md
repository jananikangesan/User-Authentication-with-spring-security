1.  @EnableWebSecurity annotation is used to enable Spring Security’s web security support and provide the Spring MVC integration. This will be used in the Configuration class (@Configuration annotation) is defined
2.  SecurityFilterChain bean defines which URL paths should be secured and which should not.
3.  InMemoryUserDetailsManager  implements UserDetailsService to provide support for username/password based authentication that is stored in memory.
4.  UserDetails based authentication is used by Spring Security when it is configured to accept a username/password for authentication.
