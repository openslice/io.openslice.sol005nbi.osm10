package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class NsdPlacementGroupMapsKey
 implements Identifier<NsdPlacementGroupMaps> {
    private static final long serialVersionUID = 5085483991345181550L;
    private final String _placementGroupRef;


    public NsdPlacementGroupMapsKey(String _placementGroupRef) {
    
        this._placementGroupRef = _placementGroupRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NsdPlacementGroupMapsKey(NsdPlacementGroupMapsKey source) {
        this._placementGroupRef = source._placementGroupRef;
    }


    public String getPlacementGroupRef() {
        return _placementGroupRef;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_placementGroupRef);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NsdPlacementGroupMapsKey)) {
            return false;
        }
        final NsdPlacementGroupMapsKey other = (NsdPlacementGroupMapsKey) obj;
        if (!Objects.equals(_placementGroupRef, other._placementGroupRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(NsdPlacementGroupMapsKey.class);
        CodeHelpers.appendValue(helper, "_placementGroupRef", _placementGroupRef);
        return helper.toString();
    }
}

