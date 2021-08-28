package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.pnfd.rev190425;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * Physcial Network Function Descriptor.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-pnfd</b>
 * <pre>
 * module etsi-nfv-pnfd {
 *   yang-version 1.1;
 *   namespace urn:etsi:nfv:yang:etsi-nfv-pnfd;
 *   prefix pnfd;
 *   import etsi-nfv-descriptors {
 *     prefix vnf;
 *   }
 *   revision 2019-04-25 {
 *   }
 *   container pnfd {
 *     presence "PNFD container.";
 *     uses vnf:pnfd;
 *   }
 * }
 * </pre>
 *
 */
public interface EtsiNfvPnfdData
    extends
    DataRoot
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.pnfd.rev190425.Pnfd</code> <code>pnfd</code>, or <code>null</code> if not present
     */
    @Nullable Pnfd getPnfd();

}

