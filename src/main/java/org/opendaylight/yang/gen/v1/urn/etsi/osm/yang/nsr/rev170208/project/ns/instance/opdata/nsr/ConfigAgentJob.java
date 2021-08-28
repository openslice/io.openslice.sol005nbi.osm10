package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.TriggerType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.Nsr;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.ParameterGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.ParameterGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.Vnfr;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.VnfrKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint32;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list config-agent-job {
 *   key job-id;
 *   leaf job-id {
 *     type uint64;
 *   }
 *   leaf job-name {
 *     type string;
 *   }
 *   leaf job-status {
 *     type enumeration {
 *       enum pending;
 *       enum success;
 *       enum failure;
 *     }
 *   }
 *   leaf triggered-by {
 *     type trigger-type;
 *   }
 *   leaf create-time {
 *     type uint32;
 *   }
 *   leaf job-status-details {
 *     type string;
 *   }
 *   uses manotypes:primitive-parameter-value;
 *   list parameter-group {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     uses manotypes:primitive-parameter-value;
 *   }
 *   list vnfr {
 *     key id;
 *     leaf id {
 *       type yang:uuid;
 *     }
 *     leaf vnf-job-status {
 *       type enumeration {
 *         enum pending;
 *         enum success;
 *         enum failure;
 *       }
 *     }
 *     list primitive {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       uses manotypes:primitive-parameter-value;
 *       leaf execution-id {
 *         type string;
 *       }
 *       leaf execution-status {
 *         type enumeration {
 *           enum pending;
 *           enum success;
 *           enum failure;
 *         }
 *       }
 *       leaf execution-error-details {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:etsi:osm:yang:nsr?revision=2017-02-08)ns-instance-opdata/nsr/config-agent-job</i>
 * 
 * <p>To create instances of this class use {@link ConfigAgentJobBuilder}.
 * @see ConfigAgentJobBuilder
 * @see ConfigAgentJobKey
 *
 */
public interface ConfigAgentJob
    extends
    ChildOf<Nsr>,
    Augmentable<ConfigAgentJob>,
    PrimitiveParameterValue,
    Identifiable<ConfigAgentJobKey>
{


    public enum JobStatus implements Enumeration {
        Pending(0, "pending"),
        
        Success(1, "success"),
        
        Failure(2, "failure")
        ;
    
        private static final Map<String, JobStatus> NAME_MAP;
        private static final Map<Integer, JobStatus> VALUE_MAP;
    
        static {
            final Builder<String, JobStatus> nb = ImmutableMap.builder();
            final Builder<Integer, JobStatus> vb = ImmutableMap.builder();
            for (JobStatus enumItem : JobStatus.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private JobStatus(int value, String name) {
            this.value = value;
            this.name = name;
        }
    
        @Override
        public String getName() {
            return name;
        }
    
        @Override
        public int getIntValue() {
            return value;
        }
    
        /**
         * Return the enumeration member whose {@link #getName()} matches specified value.
         *
         * @param name YANG assigned name
         * @return corresponding JobStatus item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<JobStatus> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding JobStatus item, or null if no such item exists
         */
        public static JobStatus forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("config-agent-job");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob.class;
    }
    
    /**
     * config agent job Identifier for the NS.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>jobId</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getJobId();
    
    /**
     * Config agent job name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>jobName</code>, or <code>null</code> if not present
     */
    @Nullable String getJobName();
    
    /**
     * Job status to be set based on each VNF primitive execution, pending - if at
     * least one VNF is in pending state and remaining VNFs are in success state.
     * Success - if all VNF executions are in success state failure - if one of the VNF
     * executions is failure
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob.JobStatus</code> <code>jobStatus</code>, or <code>null</code> if not present
     */
    @Nullable JobStatus getJobStatus();
    
    /**
     * The primitive is triggered from NS or VNF level
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.TriggerType</code> <code>triggeredBy</code>, or <code>null</code> if not present
     */
    @Nullable TriggerType getTriggeredBy();
    
    /**
     * Creation timestamp of this Config Agent Job. The timestamp is expressed as
     * seconds since unix epoch - 1970-01-01T00:00:00Z
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>createTime</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getCreateTime();
    
    /**
     * Config agent job status details, in case of errors
     *
     *
     *
     * @return <code>java.lang.String</code> <code>jobStatusDetails</code>, or <code>null</code> if not present
     */
    @Nullable String getJobStatusDetails();
    
    /**
     * List of NS Primitive parameter groups
     *
     *
     *
     * @return <code>java.util.Map</code> <code>parameterGroup</code>, or <code>null</code> if not present
     */
    @Nullable Map<ParameterGroupKey, ParameterGroup> getParameterGroup();
    
    /**
     * @return <code>java.util.Map</code> <code>parameterGroup</code>, or an empty list if it is not present
     */
    default @NonNull Map<ParameterGroupKey, ParameterGroup> nonnullParameterGroup() {
        return CodeHelpers.nonnull(getParameterGroup());
    }
    
    /**
     * @return <code>java.util.Map</code> <code>vnfr</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnfrKey, Vnfr> getVnfr();
    
    /**
     * @return <code>java.util.Map</code> <code>vnfr</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnfrKey, Vnfr> nonnullVnfr() {
        return CodeHelpers.nonnull(getVnfr());
    }
    
    @Override
    ConfigAgentJobKey key();

}

