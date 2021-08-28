package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.vnf.dependency;
import com.google.common.base.MoreObjects;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnfDependencyKey
 implements Identifier<VnfDependency> {
    private static final long serialVersionUID = -7804090137105401358L;
    private final Object _vnfSourceRef;


    public VnfDependencyKey(Object _vnfSourceRef) {
    
        this._vnfSourceRef = _vnfSourceRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfDependencyKey(VnfDependencyKey source) {
        this._vnfSourceRef = source._vnfSourceRef;
    }


    public Object getVnfSourceRef() {
        return _vnfSourceRef;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_vnfSourceRef);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VnfDependencyKey)) {
            return false;
        }
        final VnfDependencyKey other = (VnfDependencyKey) obj;
        if (!Objects.equals(_vnfSourceRef, other._vnfSourceRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VnfDependencyKey.class);
        CodeHelpers.appendValue(helper, "_vnfSourceRef", _vnfSourceRef);
        return helper.toString();
    }
}

