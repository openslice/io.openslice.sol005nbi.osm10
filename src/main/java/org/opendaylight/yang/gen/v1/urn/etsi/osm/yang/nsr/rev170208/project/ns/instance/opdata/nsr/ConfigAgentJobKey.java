package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yangtools.yang.common.Uint64;

public class ConfigAgentJobKey
 implements Identifier<ConfigAgentJob> {
    private static final long serialVersionUID = 6065582256099942144L;
    private final Uint64 _jobId;


    public ConfigAgentJobKey(Uint64 _jobId) {
    
        this._jobId = _jobId;
    }
    
    /**
     * Utility migration constructor.
     *
     * @param _jobId jobId in legacy Java type
     * @deprecated Use {#link ConfigAgentJobKey(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public ConfigAgentJobKey(BigInteger _jobId) {
        this(CodeHelpers.compatUint(_jobId));
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ConfigAgentJobKey(ConfigAgentJobKey source) {
        this._jobId = source._jobId;
    }


    public Uint64 getJobId() {
        return _jobId;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_jobId);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigAgentJobKey)) {
            return false;
        }
        final ConfigAgentJobKey other = (ConfigAgentJobKey) obj;
        if (!Objects.equals(_jobId, other._jobId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(ConfigAgentJobKey.class);
        CodeHelpers.appendValue(helper, "_jobId", _jobId);
        return helper.toString();
    }
}

