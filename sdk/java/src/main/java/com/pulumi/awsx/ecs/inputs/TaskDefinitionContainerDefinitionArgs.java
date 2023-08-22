// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsx.ecs.inputs;

import com.pulumi.awsx.ecs.inputs.TaskDefinitionContainerDependencyArgs;
import com.pulumi.awsx.ecs.inputs.TaskDefinitionEnvironmentFileArgs;
import com.pulumi.awsx.ecs.inputs.TaskDefinitionFirelensConfigurationArgs;
import com.pulumi.awsx.ecs.inputs.TaskDefinitionHealthCheckArgs;
import com.pulumi.awsx.ecs.inputs.TaskDefinitionHostEntryArgs;
import com.pulumi.awsx.ecs.inputs.TaskDefinitionKeyValuePairArgs;
import com.pulumi.awsx.ecs.inputs.TaskDefinitionLinuxParametersArgs;
import com.pulumi.awsx.ecs.inputs.TaskDefinitionLogConfigurationArgs;
import com.pulumi.awsx.ecs.inputs.TaskDefinitionMountPointArgs;
import com.pulumi.awsx.ecs.inputs.TaskDefinitionPortMappingArgs;
import com.pulumi.awsx.ecs.inputs.TaskDefinitionRepositoryCredentialsArgs;
import com.pulumi.awsx.ecs.inputs.TaskDefinitionResourceRequirementArgs;
import com.pulumi.awsx.ecs.inputs.TaskDefinitionSecretArgs;
import com.pulumi.awsx.ecs.inputs.TaskDefinitionSystemControlArgs;
import com.pulumi.awsx.ecs.inputs.TaskDefinitionUlimitArgs;
import com.pulumi.awsx.ecs.inputs.TaskDefinitionVolumeFromArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * List of container definitions that are passed to the Docker daemon on a container instance
 * 
 */
public final class TaskDefinitionContainerDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionContainerDefinitionArgs Empty = new TaskDefinitionContainerDefinitionArgs();

    @Import(name="command")
    private @Nullable Output<List<String>> command;

    public Optional<Output<List<String>>> command() {
        return Optional.ofNullable(this.command);
    }

    @Import(name="cpu")
    private @Nullable Output<Integer> cpu;

    public Optional<Output<Integer>> cpu() {
        return Optional.ofNullable(this.cpu);
    }

    @Import(name="dependsOn")
    private @Nullable Output<List<TaskDefinitionContainerDependencyArgs>> dependsOn;

    public Optional<Output<List<TaskDefinitionContainerDependencyArgs>>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    @Import(name="disableNetworking")
    private @Nullable Output<Boolean> disableNetworking;

    public Optional<Output<Boolean>> disableNetworking() {
        return Optional.ofNullable(this.disableNetworking);
    }

    @Import(name="dnsSearchDomains")
    private @Nullable Output<List<String>> dnsSearchDomains;

    public Optional<Output<List<String>>> dnsSearchDomains() {
        return Optional.ofNullable(this.dnsSearchDomains);
    }

    @Import(name="dnsServers")
    private @Nullable Output<List<String>> dnsServers;

    public Optional<Output<List<String>>> dnsServers() {
        return Optional.ofNullable(this.dnsServers);
    }

    @Import(name="dockerLabels")
    private @Nullable Output<Object> dockerLabels;

    public Optional<Output<Object>> dockerLabels() {
        return Optional.ofNullable(this.dockerLabels);
    }

    @Import(name="dockerSecurityOptions")
    private @Nullable Output<List<String>> dockerSecurityOptions;

    public Optional<Output<List<String>>> dockerSecurityOptions() {
        return Optional.ofNullable(this.dockerSecurityOptions);
    }

    @Import(name="entryPoint")
    private @Nullable Output<List<String>> entryPoint;

    public Optional<Output<List<String>>> entryPoint() {
        return Optional.ofNullable(this.entryPoint);
    }

    /**
     * The environment variables to pass to a container
     * 
     */
    @Import(name="environment")
    private @Nullable Output<List<TaskDefinitionKeyValuePairArgs>> environment;

    /**
     * @return The environment variables to pass to a container
     * 
     */
    public Optional<Output<List<TaskDefinitionKeyValuePairArgs>>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * The list of one or more files that contain the environment variables to pass to a container
     * 
     */
    @Import(name="environmentFiles")
    private @Nullable Output<List<TaskDefinitionEnvironmentFileArgs>> environmentFiles;

    /**
     * @return The list of one or more files that contain the environment variables to pass to a container
     * 
     */
    public Optional<Output<List<TaskDefinitionEnvironmentFileArgs>>> environmentFiles() {
        return Optional.ofNullable(this.environmentFiles);
    }

    @Import(name="essential")
    private @Nullable Output<Boolean> essential;

    public Optional<Output<Boolean>> essential() {
        return Optional.ofNullable(this.essential);
    }

    @Import(name="extraHosts")
    private @Nullable Output<List<TaskDefinitionHostEntryArgs>> extraHosts;

    public Optional<Output<List<TaskDefinitionHostEntryArgs>>> extraHosts() {
        return Optional.ofNullable(this.extraHosts);
    }

    @Import(name="firelensConfiguration")
    private @Nullable Output<TaskDefinitionFirelensConfigurationArgs> firelensConfiguration;

    public Optional<Output<TaskDefinitionFirelensConfigurationArgs>> firelensConfiguration() {
        return Optional.ofNullable(this.firelensConfiguration);
    }

    @Import(name="healthCheck")
    private @Nullable Output<TaskDefinitionHealthCheckArgs> healthCheck;

    public Optional<Output<TaskDefinitionHealthCheckArgs>> healthCheck() {
        return Optional.ofNullable(this.healthCheck);
    }

    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * The image used to start a container. This string is passed directly to the Docker daemon.
     * 
     */
    @Import(name="image", required=true)
    private Output<String> image;

    /**
     * @return The image used to start a container. This string is passed directly to the Docker daemon.
     * 
     */
    public Output<String> image() {
        return this.image;
    }

    @Import(name="interactive")
    private @Nullable Output<Boolean> interactive;

    public Optional<Output<Boolean>> interactive() {
        return Optional.ofNullable(this.interactive);
    }

    @Import(name="links")
    private @Nullable Output<List<String>> links;

    public Optional<Output<List<String>>> links() {
        return Optional.ofNullable(this.links);
    }

    @Import(name="linuxParameters")
    private @Nullable Output<TaskDefinitionLinuxParametersArgs> linuxParameters;

    public Optional<Output<TaskDefinitionLinuxParametersArgs>> linuxParameters() {
        return Optional.ofNullable(this.linuxParameters);
    }

    @Import(name="logConfiguration")
    private @Nullable Output<TaskDefinitionLogConfigurationArgs> logConfiguration;

    public Optional<Output<TaskDefinitionLogConfigurationArgs>> logConfiguration() {
        return Optional.ofNullable(this.logConfiguration);
    }

    /**
     * The amount (in MiB) of memory to present to the container. If your container attempts to exceed the memory specified here, the container is killed.
     * 
     */
    @Import(name="memory")
    private @Nullable Output<Integer> memory;

    /**
     * @return The amount (in MiB) of memory to present to the container. If your container attempts to exceed the memory specified here, the container is killed.
     * 
     */
    public Optional<Output<Integer>> memory() {
        return Optional.ofNullable(this.memory);
    }

    @Import(name="memoryReservation")
    private @Nullable Output<Integer> memoryReservation;

    public Optional<Output<Integer>> memoryReservation() {
        return Optional.ofNullable(this.memoryReservation);
    }

    @Import(name="mountPoints")
    private @Nullable Output<List<TaskDefinitionMountPointArgs>> mountPoints;

    public Optional<Output<List<TaskDefinitionMountPointArgs>>> mountPoints() {
        return Optional.ofNullable(this.mountPoints);
    }

    /**
     * The name of a container. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of a container. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Port mappings allow containers to access ports on the host container instance to send or receive traffic.
     * 
     */
    @Import(name="portMappings")
    private @Nullable Output<List<TaskDefinitionPortMappingArgs>> portMappings;

    /**
     * @return Port mappings allow containers to access ports on the host container instance to send or receive traffic.
     * 
     */
    public Optional<Output<List<TaskDefinitionPortMappingArgs>>> portMappings() {
        return Optional.ofNullable(this.portMappings);
    }

    @Import(name="privileged")
    private @Nullable Output<Boolean> privileged;

    public Optional<Output<Boolean>> privileged() {
        return Optional.ofNullable(this.privileged);
    }

    @Import(name="pseudoTerminal")
    private @Nullable Output<Boolean> pseudoTerminal;

    public Optional<Output<Boolean>> pseudoTerminal() {
        return Optional.ofNullable(this.pseudoTerminal);
    }

    @Import(name="readonlyRootFilesystem")
    private @Nullable Output<Boolean> readonlyRootFilesystem;

    public Optional<Output<Boolean>> readonlyRootFilesystem() {
        return Optional.ofNullable(this.readonlyRootFilesystem);
    }

    @Import(name="repositoryCredentials")
    private @Nullable Output<TaskDefinitionRepositoryCredentialsArgs> repositoryCredentials;

    public Optional<Output<TaskDefinitionRepositoryCredentialsArgs>> repositoryCredentials() {
        return Optional.ofNullable(this.repositoryCredentials);
    }

    @Import(name="resourceRequirements")
    private @Nullable Output<List<TaskDefinitionResourceRequirementArgs>> resourceRequirements;

    public Optional<Output<List<TaskDefinitionResourceRequirementArgs>>> resourceRequirements() {
        return Optional.ofNullable(this.resourceRequirements);
    }

    @Import(name="secrets")
    private @Nullable Output<List<TaskDefinitionSecretArgs>> secrets;

    public Optional<Output<List<TaskDefinitionSecretArgs>>> secrets() {
        return Optional.ofNullable(this.secrets);
    }

    @Import(name="startTimeout")
    private @Nullable Output<Integer> startTimeout;

    public Optional<Output<Integer>> startTimeout() {
        return Optional.ofNullable(this.startTimeout);
    }

    @Import(name="stopTimeout")
    private @Nullable Output<Integer> stopTimeout;

    public Optional<Output<Integer>> stopTimeout() {
        return Optional.ofNullable(this.stopTimeout);
    }

    @Import(name="systemControls")
    private @Nullable Output<List<TaskDefinitionSystemControlArgs>> systemControls;

    public Optional<Output<List<TaskDefinitionSystemControlArgs>>> systemControls() {
        return Optional.ofNullable(this.systemControls);
    }

    @Import(name="ulimits")
    private @Nullable Output<List<TaskDefinitionUlimitArgs>> ulimits;

    public Optional<Output<List<TaskDefinitionUlimitArgs>>> ulimits() {
        return Optional.ofNullable(this.ulimits);
    }

    @Import(name="user")
    private @Nullable Output<String> user;

    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    @Import(name="volumesFrom")
    private @Nullable Output<List<TaskDefinitionVolumeFromArgs>> volumesFrom;

    public Optional<Output<List<TaskDefinitionVolumeFromArgs>>> volumesFrom() {
        return Optional.ofNullable(this.volumesFrom);
    }

    @Import(name="workingDirectory")
    private @Nullable Output<String> workingDirectory;

    public Optional<Output<String>> workingDirectory() {
        return Optional.ofNullable(this.workingDirectory);
    }

    private TaskDefinitionContainerDefinitionArgs() {}

    private TaskDefinitionContainerDefinitionArgs(TaskDefinitionContainerDefinitionArgs $) {
        this.command = $.command;
        this.cpu = $.cpu;
        this.dependsOn = $.dependsOn;
        this.disableNetworking = $.disableNetworking;
        this.dnsSearchDomains = $.dnsSearchDomains;
        this.dnsServers = $.dnsServers;
        this.dockerLabels = $.dockerLabels;
        this.dockerSecurityOptions = $.dockerSecurityOptions;
        this.entryPoint = $.entryPoint;
        this.environment = $.environment;
        this.environmentFiles = $.environmentFiles;
        this.essential = $.essential;
        this.extraHosts = $.extraHosts;
        this.firelensConfiguration = $.firelensConfiguration;
        this.healthCheck = $.healthCheck;
        this.hostname = $.hostname;
        this.image = $.image;
        this.interactive = $.interactive;
        this.links = $.links;
        this.linuxParameters = $.linuxParameters;
        this.logConfiguration = $.logConfiguration;
        this.memory = $.memory;
        this.memoryReservation = $.memoryReservation;
        this.mountPoints = $.mountPoints;
        this.name = $.name;
        this.portMappings = $.portMappings;
        this.privileged = $.privileged;
        this.pseudoTerminal = $.pseudoTerminal;
        this.readonlyRootFilesystem = $.readonlyRootFilesystem;
        this.repositoryCredentials = $.repositoryCredentials;
        this.resourceRequirements = $.resourceRequirements;
        this.secrets = $.secrets;
        this.startTimeout = $.startTimeout;
        this.stopTimeout = $.stopTimeout;
        this.systemControls = $.systemControls;
        this.ulimits = $.ulimits;
        this.user = $.user;
        this.volumesFrom = $.volumesFrom;
        this.workingDirectory = $.workingDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskDefinitionContainerDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskDefinitionContainerDefinitionArgs $;

        public Builder() {
            $ = new TaskDefinitionContainerDefinitionArgs();
        }

        public Builder(TaskDefinitionContainerDefinitionArgs defaults) {
            $ = new TaskDefinitionContainerDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder command(@Nullable Output<List<String>> command) {
            $.command = command;
            return this;
        }

        public Builder command(List<String> command) {
            return command(Output.of(command));
        }

        public Builder command(String... command) {
            return command(List.of(command));
        }

        public Builder cpu(@Nullable Output<Integer> cpu) {
            $.cpu = cpu;
            return this;
        }

        public Builder cpu(Integer cpu) {
            return cpu(Output.of(cpu));
        }

        public Builder dependsOn(@Nullable Output<List<TaskDefinitionContainerDependencyArgs>> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        public Builder dependsOn(List<TaskDefinitionContainerDependencyArgs> dependsOn) {
            return dependsOn(Output.of(dependsOn));
        }

        public Builder dependsOn(TaskDefinitionContainerDependencyArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        public Builder disableNetworking(@Nullable Output<Boolean> disableNetworking) {
            $.disableNetworking = disableNetworking;
            return this;
        }

        public Builder disableNetworking(Boolean disableNetworking) {
            return disableNetworking(Output.of(disableNetworking));
        }

        public Builder dnsSearchDomains(@Nullable Output<List<String>> dnsSearchDomains) {
            $.dnsSearchDomains = dnsSearchDomains;
            return this;
        }

        public Builder dnsSearchDomains(List<String> dnsSearchDomains) {
            return dnsSearchDomains(Output.of(dnsSearchDomains));
        }

        public Builder dnsSearchDomains(String... dnsSearchDomains) {
            return dnsSearchDomains(List.of(dnsSearchDomains));
        }

        public Builder dnsServers(@Nullable Output<List<String>> dnsServers) {
            $.dnsServers = dnsServers;
            return this;
        }

        public Builder dnsServers(List<String> dnsServers) {
            return dnsServers(Output.of(dnsServers));
        }

        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }

        public Builder dockerLabels(@Nullable Output<Object> dockerLabels) {
            $.dockerLabels = dockerLabels;
            return this;
        }

        public Builder dockerLabels(Object dockerLabels) {
            return dockerLabels(Output.of(dockerLabels));
        }

        public Builder dockerSecurityOptions(@Nullable Output<List<String>> dockerSecurityOptions) {
            $.dockerSecurityOptions = dockerSecurityOptions;
            return this;
        }

        public Builder dockerSecurityOptions(List<String> dockerSecurityOptions) {
            return dockerSecurityOptions(Output.of(dockerSecurityOptions));
        }

        public Builder dockerSecurityOptions(String... dockerSecurityOptions) {
            return dockerSecurityOptions(List.of(dockerSecurityOptions));
        }

        public Builder entryPoint(@Nullable Output<List<String>> entryPoint) {
            $.entryPoint = entryPoint;
            return this;
        }

        public Builder entryPoint(List<String> entryPoint) {
            return entryPoint(Output.of(entryPoint));
        }

        public Builder entryPoint(String... entryPoint) {
            return entryPoint(List.of(entryPoint));
        }

        /**
         * @param environment The environment variables to pass to a container
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<List<TaskDefinitionKeyValuePairArgs>> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment The environment variables to pass to a container
         * 
         * @return builder
         * 
         */
        public Builder environment(List<TaskDefinitionKeyValuePairArgs> environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param environment The environment variables to pass to a container
         * 
         * @return builder
         * 
         */
        public Builder environment(TaskDefinitionKeyValuePairArgs... environment) {
            return environment(List.of(environment));
        }

        /**
         * @param environmentFiles The list of one or more files that contain the environment variables to pass to a container
         * 
         * @return builder
         * 
         */
        public Builder environmentFiles(@Nullable Output<List<TaskDefinitionEnvironmentFileArgs>> environmentFiles) {
            $.environmentFiles = environmentFiles;
            return this;
        }

        /**
         * @param environmentFiles The list of one or more files that contain the environment variables to pass to a container
         * 
         * @return builder
         * 
         */
        public Builder environmentFiles(List<TaskDefinitionEnvironmentFileArgs> environmentFiles) {
            return environmentFiles(Output.of(environmentFiles));
        }

        /**
         * @param environmentFiles The list of one or more files that contain the environment variables to pass to a container
         * 
         * @return builder
         * 
         */
        public Builder environmentFiles(TaskDefinitionEnvironmentFileArgs... environmentFiles) {
            return environmentFiles(List.of(environmentFiles));
        }

        public Builder essential(@Nullable Output<Boolean> essential) {
            $.essential = essential;
            return this;
        }

        public Builder essential(Boolean essential) {
            return essential(Output.of(essential));
        }

        public Builder extraHosts(@Nullable Output<List<TaskDefinitionHostEntryArgs>> extraHosts) {
            $.extraHosts = extraHosts;
            return this;
        }

        public Builder extraHosts(List<TaskDefinitionHostEntryArgs> extraHosts) {
            return extraHosts(Output.of(extraHosts));
        }

        public Builder extraHosts(TaskDefinitionHostEntryArgs... extraHosts) {
            return extraHosts(List.of(extraHosts));
        }

        public Builder firelensConfiguration(@Nullable Output<TaskDefinitionFirelensConfigurationArgs> firelensConfiguration) {
            $.firelensConfiguration = firelensConfiguration;
            return this;
        }

        public Builder firelensConfiguration(TaskDefinitionFirelensConfigurationArgs firelensConfiguration) {
            return firelensConfiguration(Output.of(firelensConfiguration));
        }

        public Builder healthCheck(@Nullable Output<TaskDefinitionHealthCheckArgs> healthCheck) {
            $.healthCheck = healthCheck;
            return this;
        }

        public Builder healthCheck(TaskDefinitionHealthCheckArgs healthCheck) {
            return healthCheck(Output.of(healthCheck));
        }

        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param image The image used to start a container. This string is passed directly to the Docker daemon.
         * 
         * @return builder
         * 
         */
        public Builder image(Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image The image used to start a container. This string is passed directly to the Docker daemon.
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        public Builder interactive(@Nullable Output<Boolean> interactive) {
            $.interactive = interactive;
            return this;
        }

        public Builder interactive(Boolean interactive) {
            return interactive(Output.of(interactive));
        }

        public Builder links(@Nullable Output<List<String>> links) {
            $.links = links;
            return this;
        }

        public Builder links(List<String> links) {
            return links(Output.of(links));
        }

        public Builder links(String... links) {
            return links(List.of(links));
        }

        public Builder linuxParameters(@Nullable Output<TaskDefinitionLinuxParametersArgs> linuxParameters) {
            $.linuxParameters = linuxParameters;
            return this;
        }

        public Builder linuxParameters(TaskDefinitionLinuxParametersArgs linuxParameters) {
            return linuxParameters(Output.of(linuxParameters));
        }

        public Builder logConfiguration(@Nullable Output<TaskDefinitionLogConfigurationArgs> logConfiguration) {
            $.logConfiguration = logConfiguration;
            return this;
        }

        public Builder logConfiguration(TaskDefinitionLogConfigurationArgs logConfiguration) {
            return logConfiguration(Output.of(logConfiguration));
        }

        /**
         * @param memory The amount (in MiB) of memory to present to the container. If your container attempts to exceed the memory specified here, the container is killed.
         * 
         * @return builder
         * 
         */
        public Builder memory(@Nullable Output<Integer> memory) {
            $.memory = memory;
            return this;
        }

        /**
         * @param memory The amount (in MiB) of memory to present to the container. If your container attempts to exceed the memory specified here, the container is killed.
         * 
         * @return builder
         * 
         */
        public Builder memory(Integer memory) {
            return memory(Output.of(memory));
        }

        public Builder memoryReservation(@Nullable Output<Integer> memoryReservation) {
            $.memoryReservation = memoryReservation;
            return this;
        }

        public Builder memoryReservation(Integer memoryReservation) {
            return memoryReservation(Output.of(memoryReservation));
        }

        public Builder mountPoints(@Nullable Output<List<TaskDefinitionMountPointArgs>> mountPoints) {
            $.mountPoints = mountPoints;
            return this;
        }

        public Builder mountPoints(List<TaskDefinitionMountPointArgs> mountPoints) {
            return mountPoints(Output.of(mountPoints));
        }

        public Builder mountPoints(TaskDefinitionMountPointArgs... mountPoints) {
            return mountPoints(List.of(mountPoints));
        }

        /**
         * @param name The name of a container. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of a container. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param portMappings Port mappings allow containers to access ports on the host container instance to send or receive traffic.
         * 
         * @return builder
         * 
         */
        public Builder portMappings(@Nullable Output<List<TaskDefinitionPortMappingArgs>> portMappings) {
            $.portMappings = portMappings;
            return this;
        }

        /**
         * @param portMappings Port mappings allow containers to access ports on the host container instance to send or receive traffic.
         * 
         * @return builder
         * 
         */
        public Builder portMappings(List<TaskDefinitionPortMappingArgs> portMappings) {
            return portMappings(Output.of(portMappings));
        }

        /**
         * @param portMappings Port mappings allow containers to access ports on the host container instance to send or receive traffic.
         * 
         * @return builder
         * 
         */
        public Builder portMappings(TaskDefinitionPortMappingArgs... portMappings) {
            return portMappings(List.of(portMappings));
        }

        public Builder privileged(@Nullable Output<Boolean> privileged) {
            $.privileged = privileged;
            return this;
        }

        public Builder privileged(Boolean privileged) {
            return privileged(Output.of(privileged));
        }

        public Builder pseudoTerminal(@Nullable Output<Boolean> pseudoTerminal) {
            $.pseudoTerminal = pseudoTerminal;
            return this;
        }

        public Builder pseudoTerminal(Boolean pseudoTerminal) {
            return pseudoTerminal(Output.of(pseudoTerminal));
        }

        public Builder readonlyRootFilesystem(@Nullable Output<Boolean> readonlyRootFilesystem) {
            $.readonlyRootFilesystem = readonlyRootFilesystem;
            return this;
        }

        public Builder readonlyRootFilesystem(Boolean readonlyRootFilesystem) {
            return readonlyRootFilesystem(Output.of(readonlyRootFilesystem));
        }

        public Builder repositoryCredentials(@Nullable Output<TaskDefinitionRepositoryCredentialsArgs> repositoryCredentials) {
            $.repositoryCredentials = repositoryCredentials;
            return this;
        }

        public Builder repositoryCredentials(TaskDefinitionRepositoryCredentialsArgs repositoryCredentials) {
            return repositoryCredentials(Output.of(repositoryCredentials));
        }

        public Builder resourceRequirements(@Nullable Output<List<TaskDefinitionResourceRequirementArgs>> resourceRequirements) {
            $.resourceRequirements = resourceRequirements;
            return this;
        }

        public Builder resourceRequirements(List<TaskDefinitionResourceRequirementArgs> resourceRequirements) {
            return resourceRequirements(Output.of(resourceRequirements));
        }

        public Builder resourceRequirements(TaskDefinitionResourceRequirementArgs... resourceRequirements) {
            return resourceRequirements(List.of(resourceRequirements));
        }

        public Builder secrets(@Nullable Output<List<TaskDefinitionSecretArgs>> secrets) {
            $.secrets = secrets;
            return this;
        }

        public Builder secrets(List<TaskDefinitionSecretArgs> secrets) {
            return secrets(Output.of(secrets));
        }

        public Builder secrets(TaskDefinitionSecretArgs... secrets) {
            return secrets(List.of(secrets));
        }

        public Builder startTimeout(@Nullable Output<Integer> startTimeout) {
            $.startTimeout = startTimeout;
            return this;
        }

        public Builder startTimeout(Integer startTimeout) {
            return startTimeout(Output.of(startTimeout));
        }

        public Builder stopTimeout(@Nullable Output<Integer> stopTimeout) {
            $.stopTimeout = stopTimeout;
            return this;
        }

        public Builder stopTimeout(Integer stopTimeout) {
            return stopTimeout(Output.of(stopTimeout));
        }

        public Builder systemControls(@Nullable Output<List<TaskDefinitionSystemControlArgs>> systemControls) {
            $.systemControls = systemControls;
            return this;
        }

        public Builder systemControls(List<TaskDefinitionSystemControlArgs> systemControls) {
            return systemControls(Output.of(systemControls));
        }

        public Builder systemControls(TaskDefinitionSystemControlArgs... systemControls) {
            return systemControls(List.of(systemControls));
        }

        public Builder ulimits(@Nullable Output<List<TaskDefinitionUlimitArgs>> ulimits) {
            $.ulimits = ulimits;
            return this;
        }

        public Builder ulimits(List<TaskDefinitionUlimitArgs> ulimits) {
            return ulimits(Output.of(ulimits));
        }

        public Builder ulimits(TaskDefinitionUlimitArgs... ulimits) {
            return ulimits(List.of(ulimits));
        }

        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        public Builder user(String user) {
            return user(Output.of(user));
        }

        public Builder volumesFrom(@Nullable Output<List<TaskDefinitionVolumeFromArgs>> volumesFrom) {
            $.volumesFrom = volumesFrom;
            return this;
        }

        public Builder volumesFrom(List<TaskDefinitionVolumeFromArgs> volumesFrom) {
            return volumesFrom(Output.of(volumesFrom));
        }

        public Builder volumesFrom(TaskDefinitionVolumeFromArgs... volumesFrom) {
            return volumesFrom(List.of(volumesFrom));
        }

        public Builder workingDirectory(@Nullable Output<String> workingDirectory) {
            $.workingDirectory = workingDirectory;
            return this;
        }

        public Builder workingDirectory(String workingDirectory) {
            return workingDirectory(Output.of(workingDirectory));
        }

        public TaskDefinitionContainerDefinitionArgs build() {
            $.image = Objects.requireNonNull($.image, "expected parameter 'image' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
